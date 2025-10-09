package com.chitkara.Day52;

class Person{
    public String Name;
    private int age;
    protected String address;

    public Person(String n, int a, String adr){
        Name=n;
        age=a;
        address=adr;
    }
    public void displayInfo(){
        System.out.println("Name: "+Name+" Age: "+age);
    }

    public int getAge() {
        return age;
    }
}
public class Practice_classes {
    public static void main(String[] args) {
        Person p=new Person("Ramu",74,"CHD");
        p.displayInfo();
        System.out.println(p.getAge());
    }
}
