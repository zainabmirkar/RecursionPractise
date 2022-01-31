package com.company.string;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n=8;
        System.out.println(Prime(n,n/2));
    }

    static int Prime(int n, int i){
        // base condition
        if(i==1){
            // 1 if it prime
            return 1 ;
        }

        if(n%i==0){
            // 0 if it not prime
            return 0;
        }
        return Prime(n,i-1);
    }
}
