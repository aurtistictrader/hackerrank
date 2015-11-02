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

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
    
    if (head == null) {
        return;
    }
    
    if (head.next == null) {
        System.out.println(head.data);
        return;
    }
    
    Node currentHead = new Node();
    currentHead.data = head.data;
    
    while (head != null) {
        head = head.next;
        
        if (head != null) {
            // insert to head of reverselist
            Node newNode = new Node();
            newNode.data = head.data;
            newNode.next = currentHead;
            currentHead = newNode;
        }
    }
    
    while (currentHead != null) {
        System.out.println(currentHead.data);
        currentHead = currentHead.next;
    }
}
