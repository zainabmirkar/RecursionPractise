package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
           int ans = Sm(1234);
        System.out.println(ans);
    }

    static int Sm(int n){
           if(n==0){
               return 0;
           }

           return (n%10)+Sm(n/10);
    }
}
