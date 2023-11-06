class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    T first = head.val; // Store the value of the first node
    Node<T> curr = head;
    while (curr != null) {
      if (!curr.val.equals(first))
        return false; // Different value found, not univalue
      curr = curr.next;
    }
    return true; // All values are the same
  }
  private static <T> boolean isUnivalueRecursive(Node<T> current, T value) {
    if (current == null) return true;
    if (!current.val.equals(value)) return false;
    return isUnivalueRecursive(current.next, value);
}
  public static void main(String[] args) {
    Node<String> z = new Node<>("z");
    System.out.println((ECSource.isUnivalueList(z))); // true
    System.out.println((ECSource.isUnivalueRecursive(z,z.val))); // true   

    // Node<Integer> u = new Node<>(2);
    // Node<Integer> v = new Node<>(2);
    // Node<Integer> w = new Node<>(2);
    // Node<Integer> x = new Node<>(2);
    // Node<Integer> y = new Node<>(2);
    // u.next = v;
    // v.next = w;
    // w.next = x;
    // x.next = y;
    // // 2 -> 2 -> 2 -> 2 -> 2
    // System.out.println(ECSource.isUnivalueList(u)); // true
    // System.out.println(ECSource.isUnivalueRecursive(u, u.val)); // true

    // Node<Integer> u = new Node<>(2);
    // Node<Integer> v = new Node<>(2);
    // Node<Integer> w = new Node<>(3);
    // Node<Integer> x = new Node<>(3);
    // Node<Integer> y = new Node<>(2);
    // u.next = v;
    // v.next = w;
    // w.next = x;
    // x.next = y;
    // // 2 -> 2 -> 3 -> 3 -> 2
    // System.out.println(ECSource.isUnivalueList(u)); // false
    // System.out.println(ECSource.isUnivalueRecursive(u, u.val)); // false
  }
}
