package Trees;
import java.util.*;
public class BinaryTrees{
    public BinaryTrees(){

    }
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int val=scanner.nextInt();
        root =new Node(val);
        populate(scanner,root);
    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of "+node.val);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to the left of "+node.val);
            int val=scanner.nextInt();
            node.left=new Node(val);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter right of "+node.val);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to the right of "+node.val);
            int val=scanner.nextInt();
            node.right=new Node(val);
            populate(scanner,node.right);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BinaryTrees bt=new BinaryTrees();
        bt.populate(scanner);
        bt.display();
        bt.prettydisplay();
        System.out.println("PREORDER TRAVERSAL:");
        bt.preOrder();
        System.out.println("INORDER TRAVERSAL:");
        bt.InOrder();
        System.out.println("POSTORDER TRAVERSAL:");
        bt.postOrder();
    }
    public void display(){
        display(this.root, "");
    }
    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(indent + node.val);
        display(node.left,  indent+"\t");
        display(node.right, indent+"\t");
    }
    // tree is displayed in a bit complex way, so here is a pretty display function
    //to display tree like a tree.

    public void prettydisplay(){
        prettydisplay(root,0);
    }
    private void prettydisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettydisplay(node.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------->"+node.val);
        }
        else{
            System.out.println(node.val);
        }
        prettydisplay(node.left, level+1);
    }

    //Code for Traversal methods, it uses recursion for traversal its easy.
    //1.PreOrder Traversal, Node-->Left-->Right
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //2. InOrder Traversal, Left-->Node-->Right...here Node means assume root.
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        if(node==null){
            return;
        }
        InOrder(node.left);
        System.out.println(node.val + " ");
        InOrder(node.right);
    }

    //3. PostOrder Traversal here, Left-->Right-->Node.
     public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val + " ");
        
    }
}
