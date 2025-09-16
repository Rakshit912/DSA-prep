public class CyclicS4 {
      public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>=0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(index+1!=nums[index]){
                return index+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int[] arr,int i,int c){
        int temp=arr[i];
        arr[i]=arr[c];
        arr[c]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        int ans=firstMissingPositive(arr);
        System.out.println(ans);
    }
}
