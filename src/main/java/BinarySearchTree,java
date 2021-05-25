public class BinarySearchTree {

    // Main root node
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Create tree node

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertValue(10);
        bst.insertValue(5);
        bst.insertValue(4);
        bst.insertValue(6);
        bst.insertValue(14);
        bst.insertValue(12);
        bst.insertValue(11);
        bst.insertValue(15);


        // Traversals in BST Level order , inorder , preorder , post order
        // level Order also know as  DFS (Depth first search)
        // find Height of tree to print elements at each level of the tree

        int height = bst.findHeightOfTree(bst.root);
        System.out.println("height of tree " + height);

        System.out.println("\nLevel order output ");
        for (int i = 1; i <= height; i++) {
            bst.printLevelOrder(bst.root, i);
        }
        System.out.println("\ninorder output");
        // sorted resultant
        bst.printInorderTraversal(bst.root);

        System.out.println("\npreorder output");
        // preorder resultant
        bst.printPreOrderTraversal(bst.root);

        System.out.println("\npostorder output");
        // post order resultant
        bst.printPostOrderTraversal(bst.root);
    }

    private void printPostOrderTraversal(Node root) {
        //  right left root
        if (root != null) {
            printInorderTraversal(root.right);
            printInorderTraversal(root.left);
            System.out.print(root.data + " ");
        }
    }

    private void printPreOrderTraversal(Node root) {
        // root right left
        if (root != null) {
            System.out.print(root.data + " ");
            printInorderTraversal(root.right);
            printInorderTraversal(root.left);
        }
    }

    private void printInorderTraversal(Node root) {
        // right root left
        if (root != null) {
            printInorderTraversal(root.right);
            System.out.print(root.data + " ");
            printInorderTraversal(root.left);
        }
    }

    private void printLevelOrder(Node root, int level) {
        if (root == null) {
            return; // no action of root null
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printLevelOrder(root.left, level - 1); // recursion of left and right by reducing level
            printLevelOrder(root.right, level - 1);
        }
    }

    private int findHeightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeightOfTree(root.left);
        int rightHeight = findHeightOfTree(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    private void insertValue(int value) {
        root = addValue(root, value);
    }

    private Node addValue(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root; // creating root node
        }
        // root less than provided value insert left
        else if (root.data < value) {
            root.left = addValue(root.left, value);
        }
        // root greater than provided value insert right
        else {
            root.right = addValue(root.right, value);
        }
        return root;
    }


    /* Print nodes at the current level */
    void printCurrentLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public class Node {
        int data;
        Node right, left = null;

        // Creating constructor to initialize node value
        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }


//    10 14 5 15 12 6 4 11
//    inorder output
//    4 5 6 10 11 12 14 15
//    preorder output
//    10 4 5 6 11 12 14 15
//    postorder output
//    4 5 6 11 12 14 15 10

}
