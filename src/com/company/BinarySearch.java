package com.company;

public class BinarySearch {
    public static void main(String[] args) {
         int[] arr ={1,2,3,4,55,66,78};
         int target = 66;
        System.out.println(Binary(arr,0,arr.length-1,target));

    }

    static int Binary(int[] arr, int s, int e, int target){
        if(s>e){
            return -1;
        }

        int m = s +(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
            // whenever you are calling the recursion call make sure you return it
          return  Binary(arr, s,m-1,target);
        }
        return  Binary(arr, m+1,e,target);

    }
}
