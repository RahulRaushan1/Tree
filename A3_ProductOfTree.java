package A18_Tree;

public class A3_ProductOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(7);
        Node c = new Node(3);
        a.left = b; a.right = c;

        System.out.println(product(a));
    }
    private static int product(Node root){
        if (root == null) return 1;
        if(root.val == 0) return 0;
        return root.val * product(root.left) * product(root.right);
    }
}
