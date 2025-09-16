public class Bin2 {
     public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char ans=nextgreatestletter(arr,'c');
        System.out.println(ans);
    }
    public static char nextgreatestletter(char[] arr, char target){
          int start=0;
        int end=arr.length-1;
        while(start<=end){
        int m=start+((end-start)/2);
         if(target<arr[m]){
            end =m-1;
        }
        else{
            start=m+1;
        }
    }
    return arr[start%arr.length];
}
}
