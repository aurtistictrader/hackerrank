 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
    {
        if (root == null) {
            Node newNode = new Node();
            newNode.data = value;
            return newNode;
        }
        
        Node head = root;
        while (root != null) {
            if (value < root.data) {
                if (root.left == null) {
                    Node newNode = new Node();
                    newNode.data = value;
                    root.left = newNode;
                    break;
                } else {
                    root = root.left;
                }
            } else {
                if (root.right == null) {
                    Node newNode = new Node();
                    newNode.data = value;
                    root.right = newNode;
                    break;
                } else {
                    root = root.right;
                }
            }
        }
    
        return head;
    }

