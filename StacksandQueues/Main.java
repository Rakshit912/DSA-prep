package StacksandQueues;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new LinkedList<>();
        stack.push(5);
        stack.push(4);
        System.out.println(stack.pop());
        queue.add(3);
        queue.add(2);
        System.out.println(queue.remove());
    }
}
