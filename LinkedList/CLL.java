package LinkedList;

public class CLL {
    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void insertfirst(int data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        else{
        node.next=head;
        tail.next=node;
        tail=node;
        }
    }
    public void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.data + "->");
                temp=temp.next;
            }while(temp!=head);
    }
    }

    public static void main(String[] args) {
        CLL list=new CLL();
        list.insertfirst(10);
        list.insertfirst(16);
        list.insertfirst(18);
        list.insertfirst(13);
        list.insertfirst(3);
        list.display();
    }
}
