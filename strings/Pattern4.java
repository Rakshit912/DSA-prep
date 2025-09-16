package strings;
import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        for(int row=1;row<=2*n;row++){
            int c;
            if(row>n){
                 c=n-(row-n);
            }
            else {
                c=row;
            }
            for(int col=1;col<=c;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
