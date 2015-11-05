/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if (head == null) {
        return null;
    }
    
    Node current = head;

    // Record previous node
    Node lastNode = current;
    
    current = current.next;
    
    while (current != null) {        
        if (lastNode.data == current.data) {
            lastNode.next = current.next;
        } else {
            lastNode = current;
        }
        
        current = current.next;
    }
    
    return head;
}
