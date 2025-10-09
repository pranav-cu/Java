package com.chitkara.Day47;

import java.util.Arrays;

public class Selection_Sort {
    static void Selection(int[] arr){
        int n= arr.length,i,j;
        for(i=0;i<n-1;i++){
            int min_idx=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]) min_idx=j;
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String[] args) {
        int[] list={9,5,7,8,2,1,4,3};
        Selection(list);
        System.out.println(Arrays.toString(list));
    }
}
