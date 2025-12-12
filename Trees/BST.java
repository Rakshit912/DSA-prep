package Trees;

public class BST {
    public static class Node{
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
    public BST(){

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
        return node;
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
        BST tree=new BST();
        int[] nums={5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.display();
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
// only problem with BST is, it creates an unbalanced tree if the array is sorted.
//like 1 2 3 4 5... it creates unbalanced tree which is difficult to traverse.
//To solve this problem see AVL trees codes, or self balancing trees codes.
//If its given specifically to use an Sorted numbers or whatever like sorted array, then
//take the middle element and take left and right part and take middle element of that left and right
//part and arrange the nodes to get a balanced BST...
