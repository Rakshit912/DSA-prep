import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }


        }
        return true;

        
    }
}
