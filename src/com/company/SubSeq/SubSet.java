package com.company.SubSeq;


public class SubSet {
    public static void main(String[] args) {
        SubSetPblm("","abc");
    }
    static void SubSetPblm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // take it
         SubSetPblm(p+ch,up.substring(1));

         SubSetPblm(p,up.substring(1));
    }


    // return into an arraylist
    static void SubSetPblm1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        // take it
         SubSetPblm1(p+ch,up.substring(1));

         SubSetPblm1(p,up.substring(1));
    }
}
