package com.chitkara.Day43;

public class Table {
    public static void main(String[] args) {
        int[][] table={
                {1,2},
                {3,4},
                {5,6},
        };
        int i,j;
        for(i=0;i<table.length;i++){
            for(j=0;j<table[i].length;j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
