package com.company.string;

public class Remove_Duplicates {
    public static void main(String[] args) {
        System.out.println( remove_duplicate("aabcca"));
    }

    static String remove_duplicate(String up){
        if(up.length()<=1){
            return "";
        }
        if(up.charAt(0)==up.charAt(1)){
            // return duplicate one and rest
            return  remove_duplicate(up.substring(1));
        }else{
        return up.charAt(0) + remove_duplicate(up.substring(1));
    }

            // return that char



    }
}
