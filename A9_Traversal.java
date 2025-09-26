package A18_Tree;

public class A9_Traversal {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        System.out.print("Preorder ");
        preorder(a);
        System.out.println();
        System.out.print("Inorder");
        inorder(a);
        System.out.println();
        System.out.print("Postorder ");
        postorder(a);

    }
    private static void  preorder (Node root) {
        if(root == null) return ; // base case
        System.out.print(root.val + " ");
        preorder(root.left); //left subtree
        preorder(root.right); // right subtree
    }
    private static void  inorder (Node root) {
        if(root == null) return ; // base case
        inorder(root.left); //left subtree
        System.out.print(root.val + " ");
        inorder(root.right); // right subtree
    }
    private static void  postorder (Node root) {
        if(root == null) return ; // base case
        postorder(root.left); //left subtree
        postorder(root.right); // right subtree
        System.out.print(root.val + " ");
    }
}
