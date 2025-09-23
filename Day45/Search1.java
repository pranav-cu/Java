package com.chitkara.Day45;
import java.util.Arrays;
import java.util.Scanner;
public class Search1 {
    public static void main(String [] args){
        Scanner INN= new Scanner(System.in);
        System.out.print("Enter size: ");
        int a=INN.nextInt();
        int[] numb= new int[a];
        int i;
        for(i=0;i<a;i++){
            numb[i]=INN.nextInt();
        }
        System.out.print("Element search: ");
        int b=INN.nextInt();
        for(i=0;i<a;i++){
            if(numb[i]==b){
                System.out.print("Element "+b+" is present at "+i+" index");
                break;
            }
        }
    }
}
