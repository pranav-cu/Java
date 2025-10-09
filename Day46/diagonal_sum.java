package com.chitkara.Day46;

import java.util.Arrays;

public class diagonal_sum {
    public static void main(String[] args) {
        int[][] mat1={
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };
        int i,j,k;
        for(i=0;i<3;i++){
            for (j=0;j<3;j++){
                if(i==i && j==i) continue;
                else mat1[i][i]+=mat1[i][j];
            }
        }
        for(k=0;k<3;k++) System.out.println(Arrays.toString(mat1[k]));
    }
}
