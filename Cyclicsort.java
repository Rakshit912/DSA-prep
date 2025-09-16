
import java.util.Arrays;
//apply to this only in questions like 1 to N;
public class Cyclicsort {
    public static void main(String[] args) {
        int[] jj={2,5,3,1,4};
        cyclicsort(jj);
        System.out.println(Arrays.toString(jj));
    }
    public static void cyclicsort(int[] arr){
        
        for(int i=0;i<arr.length;){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);

            }
            else{
                i++;
            }
        }

    }
    public static void swap(int[] kk,int f,int s){
        int temp=kk[f];
        kk[f]=kk[s];
        kk[s]=temp;
    }
}
