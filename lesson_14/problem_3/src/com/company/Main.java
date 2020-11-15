package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "This is an apple. And this is a table. for example the the word wide world";
        String myLowerString = myString.toLowerCase();
        for (int i=0; i<myLowerString.length();i++){
            if (myLowerString.charAt(i)=='x' || myLowerString.charAt(i)=='w') {
                System.out.println("Встречался раньше: " + myLowerString.charAt(i));
                break;
            }
        }
        int counterX=0, counterY=0;
        for (int i=0; i<myLowerString.length();i++){
            if (myLowerString.charAt(i)=='x') {
                counterX++;
            }
            if (myLowerString.charAt(i)=='w') {
                counterY++;
            }
        }
        if (counterX==0 & counterY==0){
            JOptionPane.showMessageDialog(null, "В строке нет символа X и Y", "Title", JOptionPane.INFORMATION_MESSAGE);
        }else if (counterX==0){
            JOptionPane.showMessageDialog(null, "В строке нет символа X", "Title", JOptionPane.INFORMATION_MESSAGE );
        } else if (counterY==0){
            JOptionPane.showMessageDialog(null, "В строке нет символа Y", "Title", JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
