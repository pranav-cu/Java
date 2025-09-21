package com.chitkara.Day43;
import java.util.Arrays;
import java.util.Scanner;
public class Cache {
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter string size: ");
        int n=obj.nextInt();
        String[] caches= new String[n];

        int i;
        for(i=0;i< caches.length;i++){
            caches[i]=obj.next();
        }
        System.out.print(Arrays.toString(caches));
    }
}
