package Trees;
//This is a Leetcode medium question...Question Number:102
//this is directly leetcode runable, it doesnot have Main function..don't try to run this 
//program directly, write a main function then run it.
import java.util.*;

public class BFS {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=queue.poll();
                currentlevel.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

            }
            result.add(currentlevel);
        }

        return result;
    }




//LEETCODE QUESTION NUMBER: 103
//THE BELOW CODE IS ONLY LEETCODE RUNABLE, IT DOESNOT HAVE MAIN FUNCTION,Please create one before running in your system.
// I am using leetcode function signature only.
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        //We need to use Deque because we have to add and remove elements from both the ends.(Zigzag)
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean reverse=false;

        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                if(!reverse){
                    TreeNode currentNode=queue.pollFirst();
                    currentlevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        queue.offerLast(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.offerLast(currentNode.right);
                    }
                }
                else{
                    TreeNode currentNode=queue.pollLast();
                    currentlevel.add(currentNode.val);
                    if(currentNode.right!=null){
                        queue.offerFirst(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        queue.offerFirst(currentNode.left);
                    }
                }
            }
            reverse=!reverse;
            result.add(currentlevel);
        }

        return result;
    }


//LEETCODE QUESTION NUMBER: 107
//THE BELOW CODE IS ONLY LEETCODE RUNABLE, IT DOESNOT HAVE MAIN FUNCTION, Please create one before running in your system.
//Same as level order traversal but we add each level at 0th index of result list.
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            List<Integer> currentlevel=new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=queue.poll();
                currentlevel.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }

            }
            //add each level at 0th index thats it.
            result.add(0,currentlevel);
        }
        return result;
    }


//LEETCODE QUESTION NUMBER: 116. Populating Next Right Pointers in Each Node
//Every level should be like a linked list thats it. just link each node to its right sibling and point end node to null.
    public class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
// Lets code it Using LinkedList Approach.
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Node leftmost=root;
        while(leftmost.left!=null){
            Node current=leftmost;
            while(current!=null){
                //connection 1
                current.left.next=current.right;
                //connection 2
                if(current.next!=null){
                    current.right.next=current.next.left;
                }
                //move to next node in the same level.
                current=current.next;
            }
            //move to next level.
            leftmost=leftmost.left;
        }
        return root;
}




//LEETCODE QUESTION NUMBER:199. Binary Tree Right Side View.
//Should print only the rightmost nodes of each level.
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=queue.poll();
                //if its the last node of that level then add it to result.
                if(i==levelsize-1){
                    result.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }


//LEETCODE QUESTION NUMBER: 993. Cousins in Binary Tree.
//SAME LEVEL NODES WHICH HAVE DIFFERENT PARENTS.

    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            boolean x_found=false;
            boolean y_found=false;

            for(int i=0;i<levelsize;i++){
                TreeNode currentNode=queue.poll();
                if(currentNode.val==x){
                    x_found=true;
                }
                if(currentNode.val==y){
                    y_found=true;
                }
                //check if they are siblings
                if(currentNode.left!=null && currentNode.right!=null){
                    if((currentNode.left.val==x && currentNode.right.val==y) ||
                       (currentNode.left.val==y && currentNode.right.val==x)){
                        return false;
                    }
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            if(x_found && y_found){
                return true;
            }
            if(x_found || y_found){
                return false;
            }
        }
        return false;
    }
}