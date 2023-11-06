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
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");
    
        x.next = y; // x -> y
    
        reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }