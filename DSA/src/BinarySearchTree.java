// class TreeNode3 {
//     int val;
//     TreeNode3 left;
//     TreeNode3 right;

//     public TreeNode3(int val) {
//         this.val = val;
//         this.left = this.right = null;
//     }
// }

// public class BinarySearchTree {
//     TreeNode3 root;

//     public BinarySearchTree() {
//         this.root = null;
//     }

//     public void insert(int key) {
//         root = insertNode(root, key);
//     }

//     public TreeNode3 insertNode(TreeNode3 root, int key) {
//         if (root == null) {
//             root = new TreeNode3(key);
//             return root;
//         }
//         if (key < root.val) {
//             root.left = insertNode(root.left, key);
//         } else if (key > root.val) {
//             root.right = insertNode(root.right, key);
//         }
//         return root;
//     }

//     public void inorderTraversal(){ inorder(root); 
        
//     }

// // public void inorder(TreeNode3 root){ if(root != null){ inorder(root.left);
// // System.out.print(root.val + " "); inorder(root.right