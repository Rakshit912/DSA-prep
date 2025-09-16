public class BinS4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,10,12,14,16,18,19,100,120,200,280,400};
        System.err.println(ans(arr,18));

    }
    public static int ans(int[] arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start +1)*2;
            start=temp;

        }
        return binearysearch(arr,target,start,end);
    }
    public static int binearysearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int m=start+(end-start)/2;
            if(target<arr[m]){
                end=m-1;
            }
            else if(target>arr[m]){
                start=m+1;
            }
            else{
                return m;
            }

        }
        return -1;
    }
}
