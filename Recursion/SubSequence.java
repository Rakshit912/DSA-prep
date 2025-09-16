package Recursion;
import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseq1("","abc"));
    }
    public static void subseq(String p, String unp){
        if(unp.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=unp.charAt(0);

        subseq(p+ch,unp.substring(1));
        subseq(p,unp.substring(1));

    }
    public static ArrayList<String> subseq1(String p, String unp){
        if(unp.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=unp.charAt(0);

        ArrayList<String> left=subseq1(p+ch,unp.substring(1));
        ArrayList<String> right=subseq1(p,unp.substring(1));
        left.addAll(right);
        return left;
        

    }
}
