package A18_Tree;

public class A8_Level {
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

        System.out.println(level(a));
    }
    private static int level(Node root){
        if(root == null) return 0;
        return  1 + Math.max(level(root.left) , level(root.right));
    }
}
