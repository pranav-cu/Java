package com.chitkara.Day40;

import java.util.Scanner;
public class Pyramid_word {
    public static void main(String args []){
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word= in.nextLine();
        int len=word.length();

        int i,j;
        for(i=0;i<len;i++){
            for(j=i;j<len;j++){
                char ch=word.charAt(j);
                System.out.print(ch+ " ");
            }
            System.out.println();
        }

    }
}
