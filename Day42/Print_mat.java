package com.chitkara.Day42;

import java.util.Arrays;

public class Print_mat {
    public static void main(String [] args) {
        int[][] mat = {
                {1, 11, 3},//A
                {4, 5, 6},//B
                {7, 18, 9}//C
        };
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
    }
}
