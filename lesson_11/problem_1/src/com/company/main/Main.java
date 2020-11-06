package com.company.main;

import com.company.another.Variables;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Variables variables=new Variables();
        variables.x=10;
        variables.y=20;

        variables.displayValue();
        variables.sumOfVariables();
        variables.Max();
    }
}
