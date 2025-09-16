package Recursion;

public class Stringss {
    public static void main(String[] args){
        skip("","abcacd");
        System.out.println(skipapple("abapplecd"));
    }
    public static void skip(String p,String un){
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=un.charAt(0);
        if(ch=='a'){
            skip(p,un.substring(1));
        }
        else {
            skip(p+ch,un.substring(1));
        }
    }
    public static String skipapple(String a){
        if(a.isEmpty()){
            return"";
        }
        if(a.startsWith("apple")){
            return skipapple(a.substring(5));
        }
        else{
            return a.charAt(0) + skipapple(a.substring(1));
        }
    }
}
