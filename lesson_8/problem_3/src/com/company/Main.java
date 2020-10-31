package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {1,5,15,100,30,25};
        int max = intInArray(myArray);
        System.out.println(max);


    }
    public static int intInArray(int[] array){
        int max=array[0];
        for(int i=0; i < array.length;i++){
            if (array[i]>max){
                max = array[i];
            }

        }
        return max;

    }
}
