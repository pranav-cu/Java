package com.chitkara.Day55;

public class Wrapper {
    public static void main(String[] args) {
        int prim=100;
        Integer wapInt=prim;
        Integer b=100;
        int unboxedInt=wapInt;

        System.out.println("Wrapped integer: "+wapInt);
        System.out.println("Unboxed integer: "+unboxedInt);

        String str=wapInt.toString();
        System.out.println("String val: "+str);

        int parsedInt = Integer.parseInt("200");
        System.out.println("Parsed int: "+ parsedInt);

        System.out.println(wapInt.compareTo(b));
        System.out.println(wapInt.equals(b));

    }
}
