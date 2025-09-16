package OOPConcepts.Polymorphism;

public class Shapes {
        void area(){
        System.out.println("you are in class shapes");
    }
    public class Square extends Shapes{
        @Override/*this is an annotation used for check..if the method is not overridden,
        then this shows no red line i.e; no error...if you put it on different function 
        which is not overridden then then is will show error. So this is simply a check. */
        void area(){
            System.out.println("cube of the side");
        }
    }
    public class Triangle extends Shapes{
        @Override
        void area(){
            System.out.println("2* length * breadth");
        }
    }
    public class Circle extends Shapes{
        @Override
        void area(){
            System.out.println("area is pi* r*r");
        }
    }
    public static void main(String[] args) {
        Shapes obj=new Shapes();
        //obj.area();
        Shapes square=obj.new Square();
        Triangle triangle=obj.new Triangle();
        Circle circle=obj.new Circle();
        square.area();
    }
}
