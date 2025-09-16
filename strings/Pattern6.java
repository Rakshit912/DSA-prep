package strings;

import java.util.Scanner;

public class Pattern6 {
     public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    public static void pattern(int n){
        int original=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int ateveryindex=original-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }

}
}
