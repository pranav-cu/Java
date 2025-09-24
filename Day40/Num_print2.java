package com.chitkara.Day40;

public class Num_print2 {
    public static void main(String [] args){
        int i,j;
        for(i=0;i<7;i++){
            for(j=1;j<8-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
