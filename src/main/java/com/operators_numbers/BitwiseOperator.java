package com.operators_numbers;

public class BitwiseOperator {
    public static void main(String[] args) {
        int x=7;
        int y=17;
        int z= x&y;
        //7 - 111  & 17-10001  1
        System.out.println(z);
        System.out.println("Binary Value: "+ Integer.toBinaryString(z));
    }
}
