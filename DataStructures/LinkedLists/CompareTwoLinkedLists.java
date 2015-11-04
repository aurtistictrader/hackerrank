/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    // Base cases 
    if (headA == null && headB == null) {
        return 1;
    } else if (headA == null || headB == null) {
        return 0;
    }
    
    while (headA != null && headB != null) {
        if (headA.data != headB.data) {
            return 0;
        }
        headA = headA.next;
        headB = headB.next;
    }
    
    if (headA == headB) {
        return 1;
    }
    
    return 0;
}
