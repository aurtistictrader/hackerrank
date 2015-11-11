/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void Preorder(Node root) {
    if (root == null) {
        return;
    } else {
        System.out.print(root.data + " ");
    }
    
    if (root.left != null) {
        Preorder(root.left);
    }
    
    if (root.right != null) {
        Preorder(root.right);
    }
}