package com.chitkara.Day44;
import java.util.Scanner;
public class CountDown {
    static int Count(int n){
        if(n==0) return 0;
        else{
            System.out.println(n);
            return Count(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner Inn= new Scanner(System.in);
        int i=Inn.nextInt();
        Count(i);
    }
}
