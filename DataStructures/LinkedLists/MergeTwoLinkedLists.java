/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node MergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    if (headA == null && headB == null) {
        return null;
    }
    if (headA == null && headB != null) {
        return headB;
    }
    if (headA != null && headB == null) {
        return headA;
    }
    
    Node nextNode = new Node();
    
    // initalize head node
    if (headA.data > headB.data) {
        nextNode.data = headB.data;
        headB = headB.next;
    } else {
        nextNode.data = headA.data;
        headA = headA.next;
    }
    
    // Setup head
    Node mergedHead = nextNode;
    
    // Add lower node, continue the list that has smaller node
    while (headA != null && headB != null) {
        Node newNode = new Node();
        if (headA.data > headB.data) {
            newNode.data = headB.data;
            nextNode.next = newNode;
            
            headB = headB.next;
        } else {
            newNode.data = headA.data;
            nextNode.next = newNode;
            
            headA = headA.next;
        }
        
        nextNode = nextNode.next;
    }
    
    // Add the rest if there are any
    if (headA == null && headB != null) {
        nextNode.next = headB;
    } else if (headA != null && headB == null) {
        nextNode.next = headA;
    }
    
    return mergedHead;    
}


