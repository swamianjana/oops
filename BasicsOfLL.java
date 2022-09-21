public class BasicsOfLL {

  Node head;

  private int size;

  BasicsOfLL() {
    this.size = 0;

  }

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;

    }
  }

  // add first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }

  // last

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
  }

  // print
  public void printList() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  // delete first
  public void deleteFirst() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    size--;
    head = head.next; // this line used for to delete first

  }

  // delete last
  public void deleteLast() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head; // line 71 and 72 use to transvere
    Node lastNode = head.next;

    while (lastNode.next != null) { // head.next = null -> lastNode -> null
      lastNode = lastNode.next; // null.next ---> gives error
      secondLast = secondLast.next;

    }
    secondLast.next = null;
  }

  public int getSize() {
    return size;

  }

  public static void main(String[] args) {
    BasicsOfLL list = new BasicsOfLL();
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.addLast("list");
    list.printList();

    list.addFirst("this");
    list.printList();

    list.deleteFirst();
    list.printList();

    list.deleteLast();
    list.printList();

    System.out.println(list.getSize()); // putput 2 aaaya because null count nhi krta

    list.addFirst("this");
    System.out.println(list.getSize());

  }
}
