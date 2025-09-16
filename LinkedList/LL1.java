package LinkedList;
//Solved questions on LL like  reversing linked using recurssion and iteration.isPalindrome,
//mergesort,finding middle element and many more.
public class LL1 {
    Node head;
    int size;
    Node tail;
    public LL1(){
        this.size=0;
    }
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void insertLast(int data){
        Node newnode=new Node(data);

        if(tail==null&&head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL1 list=new LL1();
        list.insertLast(2);
        list.insertLast(34);
        list.insertLast(25);
        list.insertLast(1);
        list.insertLast(12);
        list.insertLast(22);
        list.display();
        System.out.println(list.ishappy(19));
        Node center = list.middlenode(list.head);
        System.out.println("Middle node is: " + center.data);
        list.reverse(list.head);
        list.display();
        list.reverseIterative();
        list.display();
        list.reversePart(list.head,2,5);//i have used list.head here because head is non static here that means depends on a object list so i used list.head in my static method(static method is independent of object and it expects the data in it to be independent of object).
        list.display();
    }



    // some important Questions
    //1.to find if the number is happy number.
    //it means squaring the digits of number and adding them,if we get sum as 1 in any step
    //thats a happy number else return false thats it.
    public boolean ishappy(int n){
        int slow=n;
        int fast=n;
        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    private int findsquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number=number/10;
        }
        return ans;
    }

    //2.Find the middle of the linked list?
    //we can do it using fast and slow pointers.when our fast pointer reaches end then our slow
    //will be at the half or middle of the list therefore return slow for center of the list.
    //lets code it.
    public Node middlenode(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //3.Reversing a linked list using Recursion;
    //we implement reversing logic when returning out of the recursion.
    //lets code it;
    public void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    //4.Reversing a linkedlist without recursion,we will use three pointers prev,pres,next.
    private void reverseIterative() {
        if(size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next;
        while (present!=null){
            next=present.next;
            present.next=prev;
            prev=present;
            present=next;
            
        }
        head=prev;
    }



    //5.Reverse a part of the linked list,like the two index left and right is given to us
    //so we need to only reverse that part of the list
    public Node reversePart(Node head,int left,int right) {
        if(left==right){
            return head;
        }
        Node present=head;
        Node prev=null;
        for(int i=0;i<left-1 &&present!=null;i++){
            prev=present;
            present=present.next;

        }
        Node last=prev;
        Node newend=present;
        //now we have to reverse between left and right 
        //we have used (right-left+1) to calculate the number of elements between
        //left and rigth to reverse.
        Node next=present.next;
        for(int i=0;present!=null&&i<right-left+1;i++){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }
        else{
            head=prev;
        }
        newend.next=present;
        return head;
    }



    //6.Find if the given linked list is palindrome or not. 
    //first find middle element, reverse the second half of the linked list
    //then compare first and second half if same return true else false;
    //then atlast rereverse the list..that's it.
//    public boolean isPalindrome(Node head){
//        Node mid=middlenode(head);
//        Node headsecond=reverse(mid);
//        Node rereversehead=headsecond;
//        //comparing both the halves
//        while(head!=null && headsecond!=null){
//            if(head.data!=headsecond.data){
//                break;
//            }
//            head=head.next;
//            headsecond=headsecond.next;
//        }
//        reverse(rereversehead);
//        if(head==null&&headsecond==null){
//            return true;
//        }
//        return false;
//    }
}