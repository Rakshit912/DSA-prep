package LinkedList;

 public class LLrec {
    Node head;
    Node tail;
    int size;
    public LLrec(){
        this.size=0;
    }
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public  Node(int value, Node next){
            this.value=value;
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
    public void Insertrec(int value,int index){
        head=Insertrec(index, value, head);
    }
    public Node Insertrec(int index, int value, Node node){
        if(index==0){
            Node temp=new Node(value, node);
            size++;
            return temp;
        }
        node.next=Insertrec(index-1,value,node.next);
        return node;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.value + "->");
             temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        LLrec list=new LLrec();
        list.insertfirst(10);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertfirst(3);
        list.display();
        list.Insertrec(88,2);
        list.display();
    }

}
