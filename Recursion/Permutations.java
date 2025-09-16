package Recursion;

public class Permutations {
    public static void main(String[] args) {
        permutations("","abc");
    }
    public static void permutations(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=unp.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,unp.substring(1));
        }
    }
}
