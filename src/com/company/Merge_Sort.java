package com.company;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = merge_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge_sort(int[] arr){
        // base condition
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+ second.length];
        // make pointers for the three arrays
        int i=0;
        int j=0;
        int k=0;
       while(i< first.length &&j< second.length){
           if (first[i]<first[j]){
               mix[k] = first[i];
               i++;

           }else{
               mix[k] = first[j];
               j++;

           }
           k++;
       }
        // it may be possible that one of the arrays is not complete
        while(i< first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
