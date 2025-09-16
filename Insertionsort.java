
import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] op={5,3,4,2,1};
        insertionsort(op);
        System.out.println(Arrays.toString(op));
    }
    public static void insertionsort(int[] op){
        for(int i=0;i<op.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(op[j]<op[j-1]){
                    swap(op,j,j-1);
                }
                else {
                    break;
                }
                }
            }
        }

    public static void swap(int[] arr,int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;

    }
}
