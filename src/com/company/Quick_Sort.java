package com.company;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
         int[] arr={5,4,3,2,1};
         sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high){
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            // left side should always be smaller than the pivot
            while(nums[s]<pivot){
                // keep moving forward
                s++;
            }
            while(nums[e]>pivot){
                // keep moving backwards
                e--;
            }

            // condition violated
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e]= temp;
                s++;
                e--;
            }

        }
        // now the pivot is at correct index sort the two halves
             sort(nums, low, e);
             sort(nums, s,high );

    }
}
