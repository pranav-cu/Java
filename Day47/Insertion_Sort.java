package com.chitkara.Day47;

import java.util.Arrays;

public class Insertion_Sort {
    static void Insertion(int[] arr){
        int n= arr.length;
        for (int i=1;i<n;i++){
            int key= arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int[] sort={8,9,2,3,4,7,6};
        Insertion(sort);
        System.out.println(Arrays.toString(sort));
    }
}
