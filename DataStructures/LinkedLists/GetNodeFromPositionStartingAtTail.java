/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    if (head == null) {
        return 0;
    }
    
    // Reverse list to count from tail
    Node reversedHead = Reverse(head);
    
    Node current = reversedHead;

    for (int i = 0; i < n; i++) {
        current = current.next;
    }
    
    return current.data;
}

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
