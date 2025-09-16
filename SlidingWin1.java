//Question is to find maximum sum subarray of size or length k;

public class SlidingWin1 {
    public static void main(String[] args) {
        int[] arr={2,9,31,-4,21,7};
        int k=3;
        System.out.println(maxsumSubarray(arr, k));
    }
    public static int maxsumSubarray(int[] arr,int k){
        int wsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum=wsum+arr[i];
        }
        for(int i=k;i<arr.length;i++){
            wsum=wsum-arr[i-k]+arr[i];
            if(wsum>maxsum){
                maxsum=wsum;
            }
        }
        return maxsum;
    }
}
