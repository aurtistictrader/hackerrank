   /*
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
    {
         if (root == null) {
             return 1;
         }
       
       int left = 0;
       int right = 0;
        if (root.left != null) {
            left = height(root.left) + 1;
        }
       
       if (root.right != null) {
           right = height(root.right) + 1;
       }
       
       if (right == 0 && left == 0) {
           return 1;
       }
       
       if (left > right) {
           return left;
       }
        
       return right;
   }
