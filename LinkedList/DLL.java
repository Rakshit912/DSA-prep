package LinkedList;

public class DLL {
    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;
        Node prev;
        
        public Node (int data){
            this.data=data;
        }
        public Node(int data, Node next, Node prev){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
    public void insertfirst(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
        node.next=head;
        head.prev=node;
        head=node;
        }
    
    }
    public void insertLast(int data){
        Node node=new Node(data);
        Node temp=head;
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    public int deletefirst(){
        if(head==null){
            return -1;
        }
        int val=head.data;
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
        return val;
    }
    public void displayreverse(){
        Node temp=tail;
        while(temp!=null){
            System.err.print(temp.data + "->");
            temp=temp.prev;
        }
        System.out.println();
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
    DLL list=new DLL();
    list.insertfirst(10);
    list.insertfirst(2);
    list.insertfirst(8);
    list.insertfirst(17);
    list.insertfirst(3);
    list.insertLast(99);
    list.display();
    list.displayreverse();
    System.out.println(list.deletefirst());
    list.display();
    }
}

