package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 28, 4, 57, 28, 37};
        int ans = linearsearch(arr, 28, 0);
        System.out.println(ans); // Output will be -1 if not found
        easy(arr, 28,0);
        System.out.println(list);
    }

    public static int linearsearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1; // base case: reached end, not found
        }
        if (arr[i] == target) {
            return i; // found
        }
        return linearsearch(arr, target, i + 1); // check next index
    }
    static ArrayList<Integer> list=new ArrayList<>();
    public static void easy(int[] arr,int target,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        easy(arr, target, i+1);
    }
}
