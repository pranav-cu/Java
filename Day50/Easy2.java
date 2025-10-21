package com.chitkara.Day50;

public class Easy2 {
    public static void main(String[] args) {
        StringBuffer s1= new StringBuffer("Learning");
        s1=s1.append(" Java");
        System.out.println(s1.insert(s1.length()," with fun"));
    }
}
