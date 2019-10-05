package com.henry;

import com.sun.source.tree.LabeledStatementTree;

public class Main {

    public static void main(String[] args) {

    }
    public static int makeNegative(int x){
        return x<0 ? x : -x;
    }
    public static String remove(String str){
        return str.substring(1,str.length()-1);
    }
    public static void reverseString(char[]s){
        int i = 0;
        int j = s.length-1;
        while(i<j){
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }



}
