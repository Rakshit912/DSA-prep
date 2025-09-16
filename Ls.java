import java.util.*;
public class Ls {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int[] arr={23,45,1,2,8,19,-3,16,-11,28};
        int ans=Linearsearch(arr,19);
        System.out.println(ans);
        System.out.println(Linearsearch2(arr,19));
    }
    public static int Linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
                
            }
        }
        return -1;
    }
    // to return true or false we use boolean return type
    public static boolean Linearsearch2(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;

    }
    
}
