package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {4,25,321,8,-91};
        int sum = sumOfDigit(myArray);
        System.out.println(sum);

    }

    public static int sumOfDigit(int[] array){
        int k=0,s=0,d=0;
        for(int i=0;i<array.length;i++){
            k=array[i];
            while (k!=0){
                d=k % 10;
                k=k/10;
                s=s+d;
            }

        }
        return s;
    }
}
