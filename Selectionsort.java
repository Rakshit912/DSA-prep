
import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={4,5,3,1,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int l=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,l);
            System.out.println(maxindex);
            swap(arr,maxindex,l);
        }
    }
    public static int getmaxindex(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] arr,int f,int s){
            int temp=arr[f];
            arr[f]=arr[s];
            arr[s]=temp;
    }
}