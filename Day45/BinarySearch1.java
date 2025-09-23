package com.chitkara.Day45;
import java.util.Scanner;
public class BinarySearch1 {
    public static void main(String [] args){
        Scanner Inn= new Scanner(System.in);
        int[] numbs={1,2,3,4,5,6,7,8,9};
//        System.out.print("Element search: ");
//        int c=Inn.nextInt();
//        int b=(numbs.length)/2;
        int target = 93;

        int start = 0;
        int end = numbs.length - 1;

//        for(int i = n; i >= 0 ; i = i/2){
//
//        }


        while(start <= end){
            int mid = (start + end) / 2;

            if(numbs[mid] == target){
                System.out.println("Found at: " + mid);
                break;
            }

            if(numbs[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    }

}
