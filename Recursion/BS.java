package Recursion;

public class BS {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,8,16,27,46};
        int ans=binarysearch(arr,90,0,arr.length-1);
        System.out.println(ans);
    }
    public static int binarysearch(int[] arr, int target,int s,int e){
         if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(target<arr[m]){
            return binarysearch(arr,target, s, m-1);
        }
        if(target>arr[m]){
            return binarysearch(arr, target, m+1, e);
            
        }
        return m;

        
    }
}
