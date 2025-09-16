
import java.util.Arrays;

public class Bin3 {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int[] ans=searchrange(arr,7 );
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchrange(int[] arr, int target){
       int[] ans={-1,-1}; 
       int start=search(arr,target,true);
       int end=search(arr,target,false);
       ans[0]=start;
       ans[1]=end;
       return ans;

    }
    public static int search(int[] arr,int target,boolean findfirstoccurance){
         int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int m=start+(end-start)/2;
            if(target<arr[m]){
                end=m-1;
            }
            else if(target>arr[m]){
                start=m+1;
            }
            else{
                 ans=m;
                if(findfirstoccurance){
                    end=m-1;
                }
                else{
                    start=m+1;
                }
            }
        }
        return ans;

    }
}
