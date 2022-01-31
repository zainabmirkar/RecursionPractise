package com.company;

public class Main {

    public static void main(String[] args) {
	// print numbers from 1 to 5
        int ans = func(4);
        System.out.println(ans);
    }
    static int func(int n){
        // base condition
         if(n<2){
             return n ;
         }

       return func(n-1)+ func(n-2);

    }
}
