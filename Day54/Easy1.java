package com.chitkara.Day54;

class Book{
    private String title;
    private String author;

    public Book(String Title, String auth){
        title=Title;
        author=auth;
    }
    public Book(Book abc){
        title=abc.title;
        author=abc.author;
    }

    public void printDet(){
        System.out.println("Title: "+title+", Author: "+author);
    }
}
public class Easy1 {
    public static void main(String[] args) {
        Book b1=new Book("HOW to be Invisible","Er. Pranav");
        Book b2=new Book(b1);
        b1.printDet();
        b2.printDet();
    }
}
