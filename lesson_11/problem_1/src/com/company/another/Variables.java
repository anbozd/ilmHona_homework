package com.company.another;

public class Variables {
    public int x;
    public int y;

    public void displayValue(){
        System.out.println("X = " + x + " Y = " + y);
    }
    public void sumOfVariables(){
        System.out.println("Sum = " + (x+y));
    }
    public void Max(){
        int max =0;
        if (x>max){
            max=x;
        }
        if (y>max){
            max=y;
        }
        System.out.println("Max = " +max);
    }
}
