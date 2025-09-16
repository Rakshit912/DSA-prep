import java.util.*;
public class AL {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<5;i++){
         list.add(in.nextInt());
         
        }
         for(int i=0;i<=4;i++){
            System.out.println(list.get(i));
         }
         System.out.println(list);
    }
    
}
