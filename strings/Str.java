package strings;

import java.util.Arrays;

public class Str {
    public static void main(String[] args) {
        String a="Rakshit";
        String b="Rakshit";
        String c=a;
        System.out.println(a==c);
        String name1=new String("Rakshit");
        String name2=new String("Rakshit");
        //here we are checking ref variables if they are pointing to the same objects
        //here both are pointing to different objects,value maybe same but they are different
        //objects,so therefore it returns false to the below statement;
        System.out.println(name1==name2);
         //so to check if the strings have same value we use .equlas method.
         //it checks value of the ref variables rather than ref variables pointing itself.
         System.out.println(name1.equals(name2));
         //to print the character at index values its same like arrays itself.
         //just use .charAt(index number) method for that.here use() not[] this like in arrays
         System.out.println(name1.charAt(1));
         System.out.println("Rakshit" + Arrays.toString(new int[]{1,2}));
         System.out.println('a'+'c');
    }
}
