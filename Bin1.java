public class Bin1 {
    public static void main(String[] args) {
        int[] arr={2,3,4,9,14,16,18};
        int ans=Ceiling(arr,19);
        System.out.println(ans);
        System.out.println(Floor(arr,99));

    }
    public static int Ceiling(int[] arr, int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
          int start=0;
        int end=arr.length-1;
        while(start<=end){
        int m=start+((end-start)/2);
        
        if(target>arr[m]){
            start=m+1;
        }
        else if(target<arr[m]){
            end =m-1;
        }
        else{
            return m;
        }
    }
    return start;
}
public static int Floor(int[] arr, int target){
          int start=0;
        int end=arr.length-1;
        while(start<=end){
        int m=start+((end-start)/2);
        
        if(target>arr[m]){
            start=m+1;
        }
        else if(target<arr[m]){
            end =m-1;
        }
        else{
            return m;
        }
    }
    return end;
}
}