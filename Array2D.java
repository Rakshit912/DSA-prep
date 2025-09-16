import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int n=in.nextInt();
        int[][] arr=new int[3][3];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
            arr[row][col]=in.nextInt();
            //System.out.print(arr[row][col] + " ");
        }
            // System.out.println();
            }
        for(int row=0;row<arr.length;row++){
            
           System.out.println(Arrays.toString(arr[row]));
        }
             System.err.println();
             System.out.println(Arrays.toString(arr[0]));

    }
}
