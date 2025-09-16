package strings;
import java.util.*;
public class Pattern5 {
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
            int space=n-c;
            for(int s=0;s<=space;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=c;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
