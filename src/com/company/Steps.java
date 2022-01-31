package com.company;

public class Steps {
    public static void main(String[] args) {
            int ans = numberOfSteps(8,0);
        System.out.println(ans);
    }

    static int numberOfSteps(int n,int c) {
        if(n==0){
            return c;
        }
         if(n%2==0){
             return numberOfSteps(n/2, c+1);
         }
         return  numberOfSteps(n-1, c+1);
    }
}
