package com.company;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(Power(n));

    }
    static boolean Power(int n){
        // base condition
        if(n==0){
            return false;
        }
        if(n==1){
            // 2 raise to 0 is 1
            return true;
        }

        if(n%2!=0){
            return false;
        }

        return Power(n/2);

    }
}
