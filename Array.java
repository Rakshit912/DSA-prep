import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=in.nextInt();
           //System.out.print(arr[i]+ " ");
        }
         //here is the enhanced output statement
        System.out.println(Arrays.toString(arr));
        //Now here is a enhanced for loop
       // for(int num:arr){
         //   System.out.println(num + " ");}
        

         
         
        
        
    }
    
}
