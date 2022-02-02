package com.company.SubSeq;

public class AsciiValue {
    public static void main(String[] args) {
        // print ascii value of a
//        char ch = 'a';
//        System.out.println(ch+0);
        SubSetAscii("","abc");

    }

    static void SubSetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // take it
        SubSetAscii(p+ch,up.substring(1));

        SubSetAscii(p,up.substring(1));
        SubSetAscii(p+(ch+0),up.substring(1));
    }
}
