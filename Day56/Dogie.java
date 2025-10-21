package com.chitkara.Day56;

class Dog{
    static int dogCount=0;
    String name;
    public Dog(String n){
        name=n;
        dogCount++;
    }
}

public class Dogie {
    public static void main(String[] args) {
        Dog a=new Dog("tuffy");
        Dog b=new Dog("Tochan");
        System.out.println(Dog.dogCount);

    }
}
