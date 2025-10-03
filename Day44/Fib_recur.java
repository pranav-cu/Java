package com.chitkara.Day44;

import java.util.Scanner;

public class Fib_recur {
    static int Fib(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner Inn= new Scanner(System.in);
        int n=Inn.nextInt();
        System.out.println(Fib(n));
    }
}
//0,1,1,2,3,5,8,13,21,34,55