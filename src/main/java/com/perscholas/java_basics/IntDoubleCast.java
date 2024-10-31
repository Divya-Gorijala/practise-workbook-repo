//Write a program that declares two integer variables, x and y,
// and assigns the number 5 to x and the number 6 to y. Declare
// a variable q and assign y/x to it and print q. Now, cast y to
// a double and assign it to q. Print q again.
package com.perscholas.java_basics;

public class IntDoubleCast {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        double q=y/x;
        System.out.println(q);
        q=(double)y/x;
        System.out.println(q);
    }
}
