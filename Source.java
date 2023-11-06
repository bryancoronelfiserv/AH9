class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> prev = null;
    Node<T> current = head;
    Node<T> nextNode = null;

    while (current != null) {
      nextNode = current.next; // Save the next node temporarily
      current.next = prev; // Reverse the link

      prev = current;
      current = nextNode;
    }
    // prev is the new head
    return prev;
  }

  public static <T> void printLinkedList(Node<T> head) {
    Node<T> current = head;
    while (current != null) {
        System.out.print(current.val);
        if (current.next != null) {
            System.out.print(" -> ");
        }
        current = current.next;
    }
    System.out.println(); // Add a newline at the end for clarity
}


  public static void main(String[] args) {
    // Node<String> x = new Node<>("x");
    // Node<String> y = new Node<>("y");
    // x.next = y; // x -> y
    // reverseList(x); // y -> x
    // // Printing solution
    // Node<String> head = Source.reverseList(x);

    // while (head != null) {
    //   System.out.println(head.val);
    //   head = head.next;

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    Node<String> e = new Node<>("e");
    Node<String> f = new Node<>("f");
    
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    // a -> b -> c -> d -> e -> f
    
    Node<String> reversedHead = reverseList(a); // f -> e -> d -> c -> b -> a
    printLinkedList(reversedHead);
  }
}