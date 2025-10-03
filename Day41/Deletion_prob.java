package com.chitkara.Day41;
import java.util.Arrays;
public class Deletion_prob {
    public static void main(String[] args) {
        int[] arr={2,4,6,9,10,13,17};
        int i ; int posi=0;
        for( i=0;i< arr.length;i++){
            if(arr[i]%5==0){
                posi=i;
                break;
            }
        }
        for(i=posi;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
