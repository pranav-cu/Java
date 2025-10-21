package com.chitkara.Day58;

class Student{
    static int studentCount=0;
    String name;
    int Roll_no;
    int marks;

    Student(){
        name="unknown";
        Roll_no=0;
        marks=0;
    }

    Student(String name,int rollNo,int marks){
        this.name=name;
        Roll_no=rollNo;
        this.marks=marks;
        studentCount++;
    }
    public char CalculateGrade(){
        if(marks>90) return 'A';
        else if(marks<=90&& marks>75) return 'B';
        else if(marks<=75&&marks>50) return 'C';
        else return 'F';
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1= new Student("John",101,85);
        Student s2= new Student("Alice",102,92);
        Student s3= new Student("bobby",103,45);
        System.out.println("Students: "+Student.studentCount);
        System.out.println(s1.name+"("+s1.Roll_no+")"+" Marks:"+s1.marks+" Grade: "+s1.CalculateGrade());
        System.out.println(s2.name+"("+s2.Roll_no+")"+" Marks:"+s2.marks+" Grade: "+s2.CalculateGrade());
        System.out.println(s3.name+"("+s3.Roll_no+")"+" Marks:"+s3.marks+" Grade: "+s3.CalculateGrade());

    }

}
