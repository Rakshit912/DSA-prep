import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=in.nextInt();
        }
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
            
        }
          return maxval;
    }
}
