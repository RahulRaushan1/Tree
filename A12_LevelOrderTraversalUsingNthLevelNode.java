package A18_Tree;

public class A12_LevelOrderTraversalUsingNthLevelNode {
    static int n ;
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
       for (int x=0;x<=3;x++){
           n=x;
           nThLevel(a,0);
           System.out.println();
       }
        nThLevel(a,0);
    }
    public static void nThLevel(Node root,int level){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        nThLevel(root.left,level+1);
        nThLevel(root.right,level+1);
    }
}


