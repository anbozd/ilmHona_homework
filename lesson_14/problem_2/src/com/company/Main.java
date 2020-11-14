package com.company;

public class Main {

    public static void main(String[] args) {
        String myString="This is an apple. And this is a table. This is a plate";
        for (int i=0;i < myString.length()-1;i++){
            if (myString.charAt(i)==myString.charAt(myString.length()-1)){
                System.out.println(i);
            }
        }
	// write your code here
    }
}
