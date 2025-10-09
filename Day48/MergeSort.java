package com.chitkara.Day48;

import java.util.Arrays;

public class MergeSort {
    static void mergeSort(int[] arr,int start, int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }

    }
    static void merge(int[] arr, int start, int mid, int end){
        int n1=mid-start+1;
        int n2= end-mid;
        int[] Left= new int[n1];
        int[] Right= new int[n2];
        for(int i=0;i<n1;i++){
            Left[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++){
            Right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=1;
        while(i<n1 && j<n2){
            if(Left[i]<=Right[j]) arr[k++]=Left[i++];
            else arr[k++]=Right[j++];
        }
        while (i<n1) arr[k++]=Left[i++];
        while (j<n2) arr[k++]=Right[j++];
    }

    public static void main(String[] args) {
        int[] dumb={7,8,6,2,1,4,3,5,77};
        mergeSort(dumb,0, dumb.length-1);
        System.out.println(Arrays.toString(dumb));
    }
}
