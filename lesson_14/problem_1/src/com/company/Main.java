package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString="This is an apple. And this is a table";
        if (myString.length()>5){
            System.out.println("первые три символа: " + myString.substring(0,3) + "; последний три символа: " +
                    myString.substring(myString.length()-3));
        } else {
            for (int i=0;i<myString.length();i++){
                System.out.println(myString.charAt(0));
            }
        }
    }
}
