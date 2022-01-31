package com.company;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,12,34,23};
        int target = 3;
        System.out.println(Search(arr,target,0));
    }

    static boolean Search(int[] arr, int target, int i){
        if(i==arr.length){
            // this means target not found
            return false;
        }
        return arr[i]==target || Search(arr,target,i+1);
    }
}
