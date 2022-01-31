package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6};

        System.out.println(Find1(arr,4,0));

//      ArrayList<Integer> ans = (Find(arr,4, 0, new ArrayList<>()));
//        System.out.println(ans);
    }

    static ArrayList<Integer> Find(int[] arr, int target,int i, ArrayList<Integer> list){
        if(i==arr.length){
            // this means target not found
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return Find(arr, target, i+1,list);



    }
    static ArrayList<Integer> Find1(int[] arr, int target,int i){
         // new list will be created for every function call
        ArrayList<Integer> list1 = new ArrayList<>();
        if(i==arr.length){
            // this means target not found
            return list1;
        }
        if(arr[i]==target){
            list1.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls =  Find1(arr, target, i+1);

        list1.addAll(ansFromBelowCalls);
        return list1;



    }
}
