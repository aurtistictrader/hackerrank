/* you only have to complete the function given below.  
Node is defined as  

struct node
{
    int data;
    node* left;
    node* right;
};

*/


void Postorder(Node root) {
    if (root == null) {
        
    }
    
    if (root.left != null) {
        Postorder(root.left);
    }
        
    if (root.right != null) {
        Postorder(root.right);
    }
    
    System.out.print(root.data + " ");
}
