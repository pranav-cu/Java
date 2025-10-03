package com.chitkara.Day42;

import java.util.Arrays;
public class Mat_sum {
    public static void main(String[] args) {
        int [][] arr= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int i,j;
        for(i=0;i<arr[0].length;i++){
            int sum=0;
            for (j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }

    }
}
