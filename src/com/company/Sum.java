package com.company;

public class Sum {
    public static void main(String[] args) {
        int a = sum1(5);
        System.out.println(a);
    }
    static int sum1(int n){
        if(n<=1){
            return 1;
        }

        return n+ sum1(n-1);
    }
}
