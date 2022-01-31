package com.company;

public class MinElement {
    public static void main(String[] args) {
              int[] arr={4,2,1,-5};
              int n= arr.length;
        System.out.println(Minimum(arr,n));
    }

    static int Minimum(int[] arr,int n){
        // if the size of the array is 1 return that element
        if(n==1){
            return arr[0];
        }

        return Math.min(arr[n-1],Minimum(arr,n-1));
    }
}
