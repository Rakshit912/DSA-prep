
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,76,87};
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int a,int b){
        int temp= arr[a];
        
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
