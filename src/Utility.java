import java.util.Stack;

public class Utility {
    public static void preOrderTraversalRecursion(TreeNode root){

        if(root != null){
            System.out.print(root.getData() + " ");
            preOrderTraversalRecursion(root.getLeft());
            preOrderTraversalRecursion(root.getRight());
        }
    }

    public static void preOrderTraversalNoRecursion(TreeNode root){

        Stack<TreeNode> s = new Stack<>();
        while(true){
            while(root != null){
                System.out.print(root.getData() + " ");
                s.push(root);
                root = root.getLeft();
            }
            if(s.isEmpty()){
                break;
            }
            root = s.pop().getRight();
        }
    }
}
