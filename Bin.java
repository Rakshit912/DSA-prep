import java.util.*;
public class Bin {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //int n=in.nextInt();
        //int[] arr=new int[n];
        //for(int i=0;i<n;i++){
            //arr[i]=in.nextInt();}

            //for binary search always use a sorted array
            int[] arr={-4,-1,0,2,5,6,8,9,34,56,78};
        System.out.println(binarysearch(arr,9));

    }
    public static int binarysearch(int[] arr,int target){
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
    return -1;
}
}
/*same way we can do for descending order array
just the logic of the array changes 
let me give the logic for that too,for desc larger elements are on left side of middle,
and smaller on right side of middle element.
if(target>arr[m]){
     end=m-1;
     }
else if(target<arr[m]){
     start=m+1;
     }
thats it remaining all is same */ 
