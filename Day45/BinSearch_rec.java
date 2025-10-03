package com.chitkara.Day45;

public class BinSearch_rec {
    static int Binary_Search(int[] arr, int target ){
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) start=mid+1;
            else end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=3;
        System.out.println("Target is present at "+Binary_Search(arr,target)+" Index");
    }
}
