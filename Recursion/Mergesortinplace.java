package Recursion;
//this is the code for mergesort inplace, here we dont create new array objects at each
//function calls rather we manupulate the same array using index values. so this is mergesortinplace. 

import java.util.Arrays;

public class Mergesortinplace {
    public static void main(String[] args) {
        int[] arr={9,4,6,23,456,3,234};
        mergesortInplace(arr,0,arr.length);
        System.err.println(Arrays.toString(arr));

    }
    public static void mergesortInplace(int[] arr, int s, int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergesortInplace(arr, s, mid);
        mergesortInplace(arr, mid, e);
        mergeInplace(arr,s,mid,e);
    }
    public static void mergeInplace(int[] arr,int s,int m,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];        }
    }
}
