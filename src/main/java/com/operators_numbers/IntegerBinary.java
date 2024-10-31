package com.operators_numbers;

public class IntegerBinary {
    public static void main(String[] args) {
        int x=9;
        System.out.println("Integer value of x: "+x);
        System.out.println("Binary value of x: "+Integer.toBinaryString(x));
        x=x<<1;
        System.out.println("Integer value of x: "+x);
        //in binary form
        System.out.println("Binary value of x after one left shift: "+Integer.toBinaryString(x));
    }
}
