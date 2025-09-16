package OOPConcepts.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }
    Box(double side){
        super();
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double l, double h, double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public static class Boxwt extends Box{
        double weight;
        public Boxwt(){
            this.weight=-1;
        }
        public Boxwt(Boxwt old){
            this.weight=old.weight;
        }
        public Boxwt(double l,double h,double w,double weight){
            super(l,h,w);//Here we are calling super class or parentclass(Box) Constructor.
            this.weight=weight;
        }
    }
    public static class Boxprice extends Boxwt{
        double cost;

        public Boxprice() {
            super();
            this.cost=-1;
        }
        Boxprice(Boxprice other){
            super(other);
            this.cost=other.cost;
    }
    public Boxprice(double l,double h,double w,double weight,double cost){
        super(l,w,h,weight);
        this.cost=cost;
    }
    }
    public void display() {
        System.out.println("box running");
    }
    public static void main(String[] args) {
        Box box =new Box(4,9.9,6.7);
        System.out.println(box.l+" " + box.w+" "+box.h);
        Box box1 =new Box(4);
        Box box2=new Box(box1);
        System.out.println(box2.l+" " + box2.w+" "+box2.h);
        Boxwt box3=new Boxwt(4,3,2,9.5);
        System.out.println(box3.l+" " + box3.w+" "+box3.h + " "+box3.weight);
        Boxprice box4=new Boxprice(2,5,3,4,8);
        System.out.println(box4.l+" " + box4.w+" "+box4.h + " "+box4.weight+" "+box4.cost);
        Boxprice box5=new Boxprice();
        System.out.println(box5.cost+" "+box5.weight+" "+box5.l);
    }
}

