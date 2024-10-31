package com.perscholas.java_basics;

public class Order {
    public static void main(String[] args) {
        double coffee=10.5;
        double cappucino=20.5;
        double espresso=30.5;
        double subtotal=3*coffee+4*cappucino+2*espresso;
        double SALES_TAX= 0.05;
        double totalSale=subtotal+subtotal*SALES_TAX;
        System.out.printf(String.format("%.2f", totalSale));
    }
}
