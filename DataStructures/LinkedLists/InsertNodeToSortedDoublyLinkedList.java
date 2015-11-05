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

Node SortedInsert(Node head,int data) {
    if (data == 0) {
        Node newNode = new Node();
        newNode.data = data;
        
        return newNode;
    }
    Node current = head;
    
    while (current != null) {
        if (data > current.data) {
            // end of list case
            if (current.next == null) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.prev = current;
                
                current.next = newNode;
                
                break;
            } else {
                current = current.next;   
            }
        } else {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = current;
            newNode.prev = current.prev;
            
            current.prev.next = newNode;
            current.prev = newNode;
            
            break;
        }
    }
    
    return head;
}
