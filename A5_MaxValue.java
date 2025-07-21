package A18_Tree;

public class A5_MaxValue {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(7);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(61);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        System.out.println(max(a));
    }
    private static int max(Node root){
        if (root==null) return Integer.MIN_VALUE;
        return Math.max(root.val , Math.max(max(root.left), max(root.right)));
    }
}
