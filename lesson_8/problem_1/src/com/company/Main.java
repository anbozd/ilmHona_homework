package com.company;

public class Main {

    public static void main(String[] args) {
        int getMaxNumber = max(-5,6);
        System.out.println(getMaxNumber);
    }
    public static int max(int x, int y) {
        int maxNumber = 0;
        if (x > maxNumber) {
            maxNumber=x;
        }
        if (y>maxNumber) {
            maxNumber=y;
        }
        return maxNumber;
    }

}
