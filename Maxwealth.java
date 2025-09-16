import java.util.*;
class Maxwealth {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr=new int[n][m];
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
            arr[row][col]=in.nextInt();
            }
        
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(maximumwealth(arr));
    }
    public static int maximumwealth(int[][] accounts){
         int max=Integer.MIN_VALUE;
         for(int row=0;row<accounts.length;row++){
            int sum=0;
            for(int col=0;col<accounts[row].length;col++){
                sum= sum+accounts[row][col];

            }
            if(sum>max){
                max=sum;
            }
        }
        return max;

    }
}