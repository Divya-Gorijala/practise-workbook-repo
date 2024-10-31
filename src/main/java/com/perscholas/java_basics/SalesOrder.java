package com.perscholas.java_basics;

public class SalesOrder {
    public static void main(String[] args) {
        double coffee=10;
        double espresso=15;
        double cappuccino=20.3;
        double subtotal=3*coffee+4*espresso+2*cappuccino;
        final double SALES_TAX=5;
        double totalSale= subtotal+subtotal*SALES_TAX/100;
        System.out.printf("%.2f\n",totalSale);
    }
}
