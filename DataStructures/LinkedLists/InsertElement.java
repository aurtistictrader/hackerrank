/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    if (head == null) {
        head.data = data;
        head.next = null;   
    return head; 
    } else {
        Node next = new Node();
        next.data = data;
        next.next = null;
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = next;
                break;
            }
            current = current.next;
        }
        return head;
    }
}