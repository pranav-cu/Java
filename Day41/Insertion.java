package com.chitkara.Day41;
import java.util.Arrays;
public class Insertion {
    public static void main(String [] args){
        int[] arr={10,20,30,40,0};
        int i,n=4, value=25, pos=2;
        for(i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=value;
        System.out.println(Arrays.toString(arr));

    }
}
