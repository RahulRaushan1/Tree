package A18_Tree;

public class A4_ProductOfNoneZeroValue {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(0);
        Node e = new Node(6);

        a.left = b; a.right = c;
        b.left = d; b.right = e;

        System.out.println(productOfNonZeroValue(a));

    }
    private static int productOfNonZeroValue(Node root){
        if( root == null) return 1;
        return (root.val == 0 ? 1 : root.val) * productOfNonZeroValue(root.left) * productOfNonZeroValue(root.right);
    }
}
