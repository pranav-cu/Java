package com.chitkara.Day46;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] mat1={
                {1,2},
                {3,4}
        };
        int[][] mat2={
                {4,5},
                {6,7}
        };
        int i,j,x;
        int[][] c= new int[2][2];
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                for(x=0;x<2;x++)
                    c[i][j]+=mat1[i][x]*mat2[x][j];
            }
        }
        for(i=0;i<2;i++) System.out.println(Arrays.toString(c[i]));

    }
}
