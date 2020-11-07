package com.company.another;

import java.util.SortedMap;

public class Counter {
    public int currentNumber;

    public Counter(int currentNumberFromConctractor){
        currentNumber = currentNumberFromConctractor;
    }

    public void addToNUmber(){
        int x=currentNumber;
        x++;
        System.out.println("Was added 1 to the currentMumber = " +x);
    }
    public void substractNumber(){
        int y=currentNumber;
        if (y>0){
            y--;
            System.out.println("Was subsrtacted from currentNumber 1  = " +y);
        } else {
            System.out.println("Subsratc if the currentNUmber > 0");
        }

    }
    public void currentValue(){
        System.out.println("The current value " + currentNumber);
    }


    
}
