package com.chitkara.Day54;

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Student(Student other){
        this.name=other.name;
        this.age=other.age;
    }

    public void printDetails(){
        System.out.println("Name: "+name+", Age: "+age);
    }
}
public class copy_construct {
    public static void main(String[] args) {
        Student s1=new Student("joey",20);
        Student s2=new Student(s1);
        s1.printDetails();
        s2.printDetails();
    }

}
