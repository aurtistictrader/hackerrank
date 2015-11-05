/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    // Reverse both lists
    Node reversedA = Reverse(headA);
    Node reversedB = Reverse(headB);
    int lastData = 0;
    
    while (reversedA != null && reversedB != null) {        
        if (reversedA.data == reversedB.data) {
            lastData = reversedA.data;
            reversedA = reversedA.next;
            reversedB = reversedB.next;
        } else {
            break;
        }
    }
    
    return lastData;
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

