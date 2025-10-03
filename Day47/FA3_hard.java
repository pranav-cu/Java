package com.chitkara.Day47;

import java.util.Scanner;
public class FA3_hard {
    public static void main(String [] args){
        Scanner Inn= new Scanner(System.in);
        System.out.print("Enter 5-dig number: ");
        int num=Inn.nextInt();
        int[] numb= new int[5];
        int i=4;
        while(num>0){
            numb[i]=num%10;
            num/=10;
            i--;
        }
        int m,n;
        for (m=0;m<5;m++){
            for(n=0;n<5-m;n++){
                System.out.print(numb[n]+ " ");
            }
            System.out.println();
        } 
    }
}
