package com.chitkara.Day58;

class Calculate{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    String add(String a,String b){
        return a+b;
    }
}

public class calculator {
    public static void main(String[] args) {
        Calculate c1=new Calculate();
        System.out.println(c1.add(7,5));
        System.out.println(c1.add(3.3,4.4));
        System.out.println(c1.add(5,6,7));
        System.out.println(c1.add("heheh","hahahah"));
    }
}
