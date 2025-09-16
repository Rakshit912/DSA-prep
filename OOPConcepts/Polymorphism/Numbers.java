package OOPConcepts.Polymorphism;
//this is a classic example for method overloading or compile time/Static Polymorphism.
public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Numbers object=new Numbers();
        System.out.println(object.sum(2,3));
        System.out.println(object.sum(2,3,4));
    }
}
