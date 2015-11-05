/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    if (head == null) {
        return 0;
    }
    
    // Record every traveled node using hashmap
    HashMap<Node, Integer> nodeMap = new HashMap<Node, Integer>();

    Node current = head;
    while (current != null) {
        if (nodeMap.get(current) != null) {
            return 1;
        }
        nodeMap.put(current, 1);
        
        current = current.next; 
    }
    
    return 0;
}
