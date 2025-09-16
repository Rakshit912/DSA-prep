package strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="abba";
        System.out.println(ispalindrome(str));
    } 
    public static boolean ispalindrome(String str){
        str=str.toLowerCase();
        int i=0;
        while(i<=str.length()/2){
            int e=str.length()-1-i;
            if(str.charAt(i)!=str.charAt(e)){
                return false;
            }
            else{
            i++;
            e--;
            }
        }
        return true;
    }
}
