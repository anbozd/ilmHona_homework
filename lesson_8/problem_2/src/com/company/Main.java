package com.company;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = sumOfSquares(5,10);
        System.out.println(sum);
    }
    public static int sumOfSquares(int a, int b) {
       int s=0;
        for (int i=a; i<=b; i++ ){
            s+=Math.pow(i,2);
        }
        return s;
    }
}
