package com.chitkara.Day42;

public class Largest_Ele_2D_Array {
    public static void main(String [] args){
        int[][] mat={
                {1,11,3},//A
                {4,5,6},//B
                {7,18,9}//C
        };
        int i,j;
        //for Row

        for(i=0;i<mat.length;i++){
            int max=mat[i][0];
            for(j=0;j<mat[i].length;j++){
                if(max<mat[i][j]) max=mat[i][j];
            }
            System.out.println("Max of "+ i +" Row is: " + max);
        }
        //for column

        for(i=0;i<mat[0].length;i++){
            int max2=mat[0][i];
            for (j=0;j<mat.length;j++){
                if(max2<mat[j][i]) max2=mat[j][i];
            }
            System.out.println("Max of "+i+" Column is: " + max2);
        }

    }
}
