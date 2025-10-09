package com.chitkara.Day50;

import java.util.Locale;

public class Strings_1 {
    public static void main(String[] args) {
        String str = new String("ALMONDY");


        System.out.println(str.concat(" roast"));
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('d','e'));
        System.out.println("Substring: "+str.substring(2,7));

        StringBuffer sb= new StringBuffer();

        System.out.println("Capacity: "+sb.capacity());

        StringBuffer SB2= new StringBuffer("UNI");
        System.out.println("Append: "+SB2.append("VERSITY"));
        System.out.println("Insert: "+SB2.insert(0,"PAPPU "));
        System.out.println("Delete: "+SB2.delete(3,5));
        System.out.println("Lenght: "+SB2.length());

        System.out.println("Reverse: "+SB2.reverse());
        System.out.println("Capacity: "+SB2.capacity());
        System.out.println("Indexof S: "+SB2.indexOf("S"));
        System.out.println();

        StringBuilder StrB=new StringBuilder();
        StrB.append("Hello");
        StrB.insert(1,"eyy");
        StrB.delete(2,3);
        System.out.println(StrB);

    }
}
