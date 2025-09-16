public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,20,19,18,30};
        int f=0;
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }
            else if(arr[i]>s && arr[i]!=f){
                s=arr[i];
            }
        }
        System.out.println(f);
        System.out.println(s);
    }
}
