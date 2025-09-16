import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
             arr[i]=in.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        // by for loop
        //for(int start=0,end=arr.length-1; start<end;start++,end--){
           // int temp=arr[start];
            //arr[start]=arr[end];
           // arr[end]=temp;}

           //now we will do it by while loop
           int start=0;
           int end=arr.length-1;
           while(start<end){
            swap(arr,start,end);
            start++;
            end--;
           }
    }
    public static void swap(int[] arr , int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
