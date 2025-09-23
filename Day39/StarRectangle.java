package com.chitkara.Day39;

import java.util.Scanner;
public class StarRectangle {
    public static void main(String [] args){
        Scanner INN= new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row= INN.nextInt();
        System.out.print("Enter Columns: ");
        int col=INN.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
