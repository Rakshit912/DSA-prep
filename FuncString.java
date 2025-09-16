import java.util.*;
public class FuncString {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("Enter your name: ");
        String n=in.next();
        System.out.print(greet(n));
    }
    public static String greet(String name){
        String mess="hiii " + name;
        return mess;
    }
}
