package LinkedList;
//here are some of the leetcode solutions 
//Question:234
 public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { 
        this.val = val; 
        }
       ListNode(int val, ListNode next) { 
        this.val = val; this.next = next; 
        }
    }
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode headSecond=reverseList(mid);
        ListNode rereversehead=headSecond;
        while(head!=null && headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }
            head=head.next;
            headSecond=headSecond.next;
        }
        reverseList(rereversehead);
        if(head==null||headSecond==null){
            return true;
        }
        return false;
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
            next=next.next;
            }
        }
        return prev;
    }
    public static void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        // Creating a palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(n1);
        System.out.println("Is Palindrome? " + result);

        // Non-palindrome list: 1 -> 2 -> 3
        ListNode m3 = new ListNode(3);
        ListNode m2 = new ListNode(2, m3);
        ListNode m1 = new ListNode(1, m2);

        System.out.println("Is Palindrome? " + sol.isPalindrome(m1));

         ListNode r5 = new ListNode(5);
        ListNode r4 = new ListNode(4, r5);
        ListNode r3 = new ListNode(3, r4);
        ListNode r2 = new ListNode(2, r3);
        ListNode r1 = new ListNode(1, r2);
        display(r1);
        sol.reorderList(r1);
        display(r1);
    }


    //Leetcode question:143 Rorder List
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        while(hf!=null && hs!=null){
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;
        }
        if(hf!=null){
            hf.next=null;
        }
    }
    //Leetcode question 61 Rotate List;
    public ListNode rotateRight(ListNode head, int k) {
        if(k<=0||head==null||head.next==null){
            return head;
        }
        ListNode last=head;
        int len=1;
        while(last.next!=null){
            last=last.next;
            len++;
        }
        last.next=head;
        int rotations=k%len;
        int skip=len-rotations;
        ListNode newlast=head;
        for(int i=0;i<skip-1;i++){
            newlast=newlast.next;
        }
        head=newlast.next;
        newlast.next=null;
        return head;
    }
}