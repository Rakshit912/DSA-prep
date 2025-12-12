package strings;
public class reverse {
    public static void main(String[] args) {
        String name="rakshit";
        String rev="";
        for(int i =0;i<name.length();i++){
            rev=name.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}
