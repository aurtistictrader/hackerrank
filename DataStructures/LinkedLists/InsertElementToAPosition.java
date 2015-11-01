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

Node InsertNth(Node head, int data, int position) {
    if (head == null) {
        Node newNode = new Node();
        newNode.data = data;
        return newNode;
    } 
    if (position == 0) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        return newNode;
    } else {
        Node current = head;
        
        // Mode forward in LL
        for (int i = 1; i < position; i++) {
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        
        // Create new node to point to current location
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = current.next;
        
        current.next = newNode;
        
        return head;
    }
}
