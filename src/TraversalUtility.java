import java.util.Stack;

public class TraversalUtility {
    public static void preOrderTraversalRecursion(TreeNode root){

        if(root != null){
            System.out.print(root.getData() + " ");
            preOrderTraversalRecursion(root.getLeft());
            preOrderTraversalRecursion(root.getRight());
        }
    }

    public static void preOrderTraversalNoRecursion(TreeNode root){
        if (root == null)
            return;
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

    public static void inOrderTraversalRecursion(TreeNode root){
        if(root != null){
            inOrderTraversalRecursion(root.getLeft());
            System.out.print(root.getData() + " ");
            inOrderTraversalRecursion(root.getRight());
        }
    }

    public static void inOrderTraversalNoRecursion(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        while(true){
            while(root != null){
                s.push(root);
                root = root.getLeft();
            }
            if(s.isEmpty()){
                break;
            }
            TreeNode top = s.pop();
            System.out.print(top.getData() + " ");
            root = top.getRight();
        }
    }

    public static void postOrderTraversalRecursion(TreeNode root){
        if(root != null){
            postOrderTraversalRecursion(root.getLeft());
            postOrderTraversalRecursion(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }

    public static void postOrderTraversalNoRecursion(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        while(true){
            while(root != null){
                s.push(root);
                root = root.getLeft();
            }
            if(s.isEmpty()){
                break;
            }
            TreeNode top = s.peek();
            if(top.getRight() != null){
                root = top.getRight();
            }else{
                System.out.print(top.getData() + " ");
                s.pop();
            }
        }
    }
}
