package com.chitkara.Day56;

public class RotateArray {
    public void rotate(int[] nums,int k){
        int n= nums.length;

        int[] copy=nums.clone();

        for(int i=0;i<n;i++){
            nums[(i+k)%n]=copy[i];
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray= new RotateArray();

        int[] num={1,2,3,4,5,6,7};
        int k=3;
        rotateArray.rotate(num,k);
        for(int nums:num){
            System.out.print(nums + " ");
        }
    }
}
