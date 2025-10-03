package com.chitkara.Day44;
import java.util.Scanner;
public class Sum_Recur {
    static int Sums(int n){
        if(n==0) return 0;
        else{

            return n+Sums(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner Inn= new Scanner(System.in);
        int sum=Inn.nextInt();
        System.out.println(Sums(sum));
    }
}
