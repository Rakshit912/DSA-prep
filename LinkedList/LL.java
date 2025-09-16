package LinkedList;

public class LL{
    Node head;
    Node tail;
    int size;
    public LL(){
        this.size=0;
    }

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
    Node node=new Node(data);
    node.next=head;
    head=node;
    if(tail==null){
        tail=head;
    }
    size=size+1;
}
public void insertLast(int data){
    if(tail==null){
        insertfirst(data);
        return;
    }
    Node node=new Node(data);
    tail.next=node;
    tail=node;
    size++;
}
public void insert(int data, int index){
    if(index==0){
        insertfirst(data);
        return;
    }
    if(index==size){
        insertLast(data);
        return;
    }
    
    Node temp= head;
    for(int i=1;i<index;i++){
        temp=temp.next;
    }
    Node newnode=new Node(data,temp.next);
    temp.next=newnode;
    size++;
}
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.data;
        prev.next=prev.next.next;
        return val;
    }
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondlast=get(size-2);
        int val=tail.data;
        tail=secondlast;
        tail.next=null;
        return val;
    }
    public int deletefirst(){
        int val=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.data + "->");
             temp=temp.next;
        }
        System.out.println("END");
    }

     

public static void main(String[] args){
    LL list=new LL();
    list.insertfirst(10);
    list.insertfirst(2);
    list.insertfirst(8);
    list.insertfirst(17);
    list.insertfirst(3);
    list.insertLast(99);
    list.insert(100,3);
    list.display();
    System.out.println(list.deletefirst());
    list.display();
    System.out.println(list.deleteLast());
    list.display();
    System.out.println(list.delete(2));
    list.display();


}

}