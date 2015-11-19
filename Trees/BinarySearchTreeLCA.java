

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2) {

    if (root == null) {
        return new Node();
    }
    
    Node head = root;

    
    while (head != null) {
        if (head.data > v1 && head.data < v2) {
            return head;
        } else if (head.data < v1 && head.data > v2) {
            return head;
        } else if (head.data > v1 && head.data > v2) {
            head = head.left;
        } else if (head.data < v1 && head.data < v2) {
            head = head.right;
        } else if (head.data == v1 || head.data == v2) {
            return head;
        }
    }
    
    return null;
}




