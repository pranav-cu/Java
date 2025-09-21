package com.chitkara.Day43;

import java.util.Arrays;
import java.util.Scanner;
public class User_Input_Array_size {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row= obj.nextInt();
        System.out.print("Enter Columns: ");
        int col=obj.nextInt();
        int[][] mat= new int[row][col];

        int i,j;
        for(i=0;i< mat.length;i++){
            for(j=0;j<mat[i].length;j++){
                System.out.print("Enter element of ["+i+"]["+j+"]:");
                mat[i][j]=obj.nextInt();
            }
        }
        for(i=0;i< mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }

    }

}
