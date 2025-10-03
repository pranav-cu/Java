package com.chitkara.Day41;
import java.util.Arrays;
public class insertion_prob {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,0};
        int i,n= A.length,pos=2,val=22;
        for(i=n-1;i>pos;i--){
            A[i]=A[i-1];
        }
        A[i]=val;
        System.out.print(Arrays.toString(A));

    }
}
