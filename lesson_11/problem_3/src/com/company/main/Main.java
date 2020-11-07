package com.company.main;

import com.company.another.Counter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Counter counter =new Counter(3);
        counter.currentValue();
        counter.addToNUmber();
        counter.substractNumber();

    }
}
