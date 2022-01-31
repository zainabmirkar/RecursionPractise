package com.company.string;

public class Str_questions {
    public static void main(String[] args) {
          String ans = skip2("bapplecdwwh");
        System.out.println(ans);
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }


    static String skip1( String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch=='a'){
           return skip1(up.substring(1));
        }else{
           return ch+ skip1(up.substring(1));
        }
    }

    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
           return skip2(up.substring(5));
        }else{
            return up.charAt(0) + skip2(up.substring(1));
        }
    }
}
