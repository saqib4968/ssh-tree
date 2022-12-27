import java.util.Stack;

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

        Utility.preOrderTraversalRecursion(root);
        System.out.println();
        Utility.preOrderTraversalNoRecursion(root);
    }
}
