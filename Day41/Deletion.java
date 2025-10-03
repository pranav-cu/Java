package com.chitkara.Day41;
import java.util.Arrays;
public class Deletion {
    public static void main(String [] args) {
        int[] arr = {10, 20, 25, 30, 40};
        int i, n = arr.length, pos = 2;
        for(i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.println(Arrays.toString(arr));
    }
}
