/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if (head == null) {
        return null;
    }
    
    Node current = head;
    
    while (current != null) {
        Node nextNode = current.next;
        Node prevNode = current.prev;
        
        // Reverse node order
        current.next = prevNode;
        current.prev = nextNode;
        
        
        if (nextNode == null) {
            break;
        }
           
        current = nextNode;   
    }
    
    // Finally this becomes the tail
    return current;
}
