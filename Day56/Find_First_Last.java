package com.chitkara.Day56;

public class Find_First_Last {
    public int[] search_Range(int[] num, int target){
        int[] result = new int[]{-1,-1};

        return result;
    }
    private int findLast(int[] num,int target){
        int low=0,high= num.length-1,index=-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(num[mid]<=target) low=mid+1;
            else high=mid-1;
            if(num[mid]==target) index= mid;
        }
        return index;
    }

    public static void main(String[] args) {
        Find_First_Last sol= new Find_First_Last();
        int[] nums={5,4,6,8,1,3,9,7};
        int target=8;
        int[] result= sol.search_Range(nums,target);
        System.out.print("["+result[0]+", "+ result[1]+"]");
    }
}
