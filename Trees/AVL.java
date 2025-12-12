package Trees;

public class AVL {
    public static  class Node{
        int value;
        Node left;
        Node right;
        int height;
    public Node(int value){
        this.value=value;

    }
    public int getvalue(){
        return value;
    }
}
    Node root;
    public AVL(){

    }
    public int height() {
        return height(root);
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void insert(int value){
        root=insert(value, root);
    }
    private Node insert(int value, Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value, node.left);
        }
        if(value>node.value){
            node.right=insert(value, node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    //Rotate function here..
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //then it is left heavy(so it will have 2 cases, left-left and left-right case.)
            if(height(node.left.left)-height(node.left.right) >0){
             //then its left left case...node is P, node.left.left=G, node.left.right=t3(any subtree)
                //if that difference is greater then 0 then obivously its left heavy.
                return rightrotate(node);//node is 'P';
            }
            if(height(node.left.left)-height(node.left.right)<0){
                //then its left-right case...because right side has more weight;
                //1.we do left rotate on child
                node.left=leftrotate(node.left);//node is always Parent node P..see in theory book.
                //2.we do right rotate on parent node;
                return rightrotate(node);
            }
        }

        // now same if conditions for Right heavy..the 3rd and 4th cases..
        if(height(node.left)-height(node.right)<-1){
            //so its right heavy..so again two cases(right-right and right-left cases).
            if(height(node.right.right)-height(node.right.left) >0){
                //its right-right case
                return leftrotate(node);//node is 'P';
            }
            //right-left case:
            if(height(node.right.right)-height(node.right.left)<0){
                //then its right-left case...because left side has more weight;
                //1.we do right rotate on child
                node.right=rightrotate(node.right);//node is always Parent node P..see in theory book.
                //2.we do left rotate on parent node;
                return leftrotate(node);
            }
        }
        return node;
    }
    //function for Rightrotate and Leftrotate...dont think just put a diagram and code that what 
    //you see in the diagram thats it no using of brain is required.
    public Node rightrotate(Node p){
        Node c=p.left;
        Node t=c.right;
        //now right rotate;
        c.right=p;
        p.left=t;
        //update the height now because ht changes once rotated..
        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;

        return c;
    }

    public Node leftrotate(Node c){
        Node p=c.right;
        Node t=p.left;
        //left rotate..
        p.left=c;
        c.right=t;
        //update the height now because ht changes once rotated..
        c.height=Math.max(height(c.left),height(c.right))+1;
        p.height=Math.max(height(p.left),height(p.right))+1;
        
        return p;
    }
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    public void display(){
        display(root,"Root Node: ");
    }
    public void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getvalue());
        display(node.left,"Left child of "+node.getvalue()+ ":");
        display(node.right,"Right child of "+node.getvalue()+ ":");
    }
    public static void main(String[] args){
        AVL tree=new AVL();

        for(int i=0;i<1000;i++){
            tree.insert(i);
        }
        System.out.println(tree.height());
        System.out.println(tree.balanced());
        //tree.display();
    }

    // code if we have sorted array or sorted numbers are given to our BST..
    public void sortedPopulate(int[] nums){
        sortedPopulate(nums,0,nums.length);
    }
    private void sortedPopulate(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        insert(nums[mid]);
        sortedPopulate(nums,start,mid);
        sortedPopulate(nums,mid+1,end);
    }
 }
