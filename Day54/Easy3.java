package com.chitkara.Day54;
class Point{
    int x;
    int y;

    public Point(int a,int b){
        x=a;
        y=b;
    }
    public Point(Point z){
        x= z.x;
        y= z.y;
    }

    public void display(){
        System.out.println("X axis: "+x+", Y axis: "+y);
    }
}
public class Easy3 {
    public static void main(String[] args) {
        Point p1= new Point(24,43);
        Point p2= new Point(p1);
        p1.display();
        p2.display();

    }
}
