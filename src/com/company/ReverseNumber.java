package com.company;

public class ReverseNumber {
    static int s = 0;
    static void reverse(int n){
        if(n==0){
            return;
        }
          int rem = n%10;
       s= s*10+rem;
        reverse(n/10);

    }
    public static void main(String[] args) {
        reverse(1234);
        System.out.println(s);
    }

}