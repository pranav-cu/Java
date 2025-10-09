package com.chitkara.Day48;

import java.util.Arrays;

public class QuickSort {
    static void Quick(int[] arr, int start , int end){
        if(start<end){
            int pi=partition(arr,start,end);
            Quick(arr,start,pi-1);
            Quick(arr,pi+1,end);
        }
    }

    static int partition(int[] arr, int start, int end){
        int pivot=arr[end];
        int i=start-1;
        for(int j= start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp= arr[i+1];
        arr[i+1]=arr[end];
        arr[end]=temp;
        return i+1;
    }
    public static void main(String[] args) {
        int[] dumb={7,8,6,2,1,4,3,5,77};
        Quick(dumb,0, dumb.length-1);
        System.out.println(Arrays.toString(dumb));
    }

}

