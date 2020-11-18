package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String myString = "This";
        String resultStr="";
        if (myString.length()>10){
            for (int i=0;i<6;i++){
                resultStr=resultStr+myString.charAt(i);
            }
        } else  {
            for (int i=0;i<12;i++){
                if (i<myString.length()){
                    resultStr=resultStr+myString.charAt(i);
                } else {
                    resultStr=resultStr+'o';
                }
            }
        }
        System.out.println(resultStr);
    }
}
