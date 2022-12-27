public class Application {

    public static void main(String [] args){
        TreeNode root = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        root.setLeft(one);
        root.setRight(two);
        one.setLeft(three);
        one.setRight(four);
        two.setLeft(five);
        two.setRight(six);

        System.out.print("Pre-order with recursion... ");
        TraversalUtility.preOrderTraversalRecursion(root);
        System.out.println();
        System.out.print("Pre-order without recursion... ");
        TraversalUtility.preOrderTraversalNoRecursion(root);

        System.out.println();

        System.out.print("In-order with recursion... ");
        TraversalUtility.inOrderTraversalRecursion(root);
        System.out.println();
        System.out.print("In-order without recursion... ");
        TraversalUtility.inOrderTraversalNoRecursion(root);

        System.out.println();

        System.out.print("Post-order with recursion... ");
        TraversalUtility.postOrderTraversalRecursion(root);
        System.out.println();
        System.out.print("Post-order without recursion... ");
        TraversalUtility.postOrderTraversalNoRecursion(root);
    }
}
