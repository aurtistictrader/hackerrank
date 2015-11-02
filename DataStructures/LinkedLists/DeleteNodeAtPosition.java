/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    if (head == null) {
        return head;
    }
    
    if (position == 0) {
        return head.next;
    }
    
    Node current = head;
    Node lastNode = current;
    for (int i = 0; i < position; i++) {
        lastNode = current; 
        current = current.next;
    }
    
    // At the end of the list
    if (current.next == null) {
        lastNode.next = null;
    } else {
        current.data = current.next.data;
        current.next = current.next.next;
    }
    
    return head;
}

