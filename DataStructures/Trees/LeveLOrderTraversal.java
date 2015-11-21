   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void LevelOrder(Node root)
    {
        if (root == null) {
            return;
        }
      
        int height = getHeight(root);
       
        Node level = root;
       
        System.out.print(level.data + " ");
       
        for (int i = 0; i < height; i++) {
            printAtDepth(root, 0, i, height);
        }
    }

    void printAtDepth(Node root, int depth, int printDepth, int maxDepth) {
        if (root == null || depth == maxDepth || depth > printDepth) {
            return;
        }
        
        if (depth == printDepth) {
            if (root.left != null) {
                System.out.print(root.left.data + " ");
            }

            if (root.right != null) {
                System.out.print(root.right.data + " ");
            }
        }
        
        if (root.left != null) {
            printAtDepth(root.left, depth + 1, printDepth, maxDepth);
        }
        
        if (root.right != null) {
            printAtDepth(root.right, depth + 1, printDepth, maxDepth);
        }
    }

    int getHeight(Node root) {
         if (root == null) {
             return 1;
         }
       
       int left = 0;
       int right = 0;
        if (root.left != null) {
            left = getHeight(root.left) + 1;
        }
       
       if (root.right != null) {
           right = getHeight(root.right) + 1;
       }
       
       if (right == 0 && left == 0) {
           return 1;
       }
       
       if (left > right) {
           return left;
       }
        
       return right;
   }

