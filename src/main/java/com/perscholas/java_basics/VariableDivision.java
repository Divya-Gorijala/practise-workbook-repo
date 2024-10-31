package com.perscholas.java_basics;
//Write a program that declares two integer variables, assigns an
// integer to each, and divides the larger number by the smaller
// number. Assign the result to a variable. Print out the result.
// Now change the larger number to a decimal. What happens? What
// corrections are needed?
public class VariableDivision {
    public static void main(String[] args) {
        double num1=12;
        double num2=20;
        double var=num2/num1;
        System.out.println((int)var);
    }
}
