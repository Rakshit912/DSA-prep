import java.util.*;
class Even {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)%2==0){

                count++;
            }
        }
        return count;
        
    }
    public static int even(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int ans=findNumbers(arr);
    System.out.println(ans);
    }
}
