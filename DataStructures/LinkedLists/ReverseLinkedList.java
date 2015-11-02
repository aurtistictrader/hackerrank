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
Node Reverse(Node head) {
    if (head == null) {
        return null;
    }

    Node newHead = new Node();
    newHead.data = head.data;
    
    
    while (head.next != null) {    
        head = head.next;
        
        // Insert new node in front list
        Node newNode = new Node();
        newNode.data = head.data;    
        newNode.next = newHead;
        
        // Reinstantiate newHead
        newHead = newNode;
    }
    
    return newHead;
}

