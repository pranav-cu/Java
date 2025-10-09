package com.chitkara.Day53;

class Car{
    String Brand;
    String color;
    int seats;
    String engine;
    public Car(String brand,String color,String engine, int seats){
        this.Brand =brand;
    }

}
public class Classes_1 {
    public static void main(String[] args) {
        Car c1=new Car("BMW","Black","Petrol",5);
        Car c2=new Car("TOYOTA","Blue","diesel",7);

    }
}
