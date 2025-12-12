package OOPConcepts;

public class Innerclasses {
    public static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Test a=new Test("Rakshit");
        Test b=new Test("Raja");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
