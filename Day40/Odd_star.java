package com.chitkara.Day40;
import java.util.Scanner;
public class Odd_star {
    public static void main(String [] args){
        Scanner Inn= new Scanner(System.in);
        int Rows=Inn.nextInt(),i,j;
        for(i=0;i<Rows;i++){
            for(j=0;j<Rows-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
