package com.operators_numbers;

public class ShiftOperator {
    public static void main(String[] args) {
        int x=150;
        System.out.println(Integer.toBinaryString(x));
        //x>>2
        x=x>>2;
        //binary value : 100101
        System.out.println(Integer.toBinaryString(x));
        //decimal value: 37
        System.out.println(x);
    }
}
