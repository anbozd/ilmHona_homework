package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {45,25,-2,3,-5,-6,10,20,60,-8,-9,5,6,44,55};
        int[] myNewArray;
        myNewArray = returnPositiveItemOfArray(myArray);
        display(myNewArray);
    }
    public static void display(int[] input){
        for (int i=0; i<input.length;i++){
            System.out.println(input[i]);
        }
    }
    public static int[] returnPositiveItemOfArray(int[] array){
        int k=0;
        for (int i=0; i<array.length;i++){
            if(array[i]>=0){
                k++;
            }
        }
        int[] returnArray=new int[k];
        int j=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>=0){
                returnArray[j]=array[i];
                j++;
            }
        }
        return returnArray;

    }
}
