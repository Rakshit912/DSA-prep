package Exceptions;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            divide(a,b);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this will execute always no matter what");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("dont divide by zero");
        }
        return a/b;
    }
}
