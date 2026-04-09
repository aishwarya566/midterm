package com.app;

public class App {
    
    public static void main(String[] args) {
        
        System.out.println("Addition: 10 + 5 = " + (10 + 5));
        System.out.println("Subtraction: 10 - 5 = " + (10 - 5));
        System.out.println("Multiplication: 10 * 5 = " + (10 * 5));
        System.out.println("Division: 10 / 5 = " + (10 / 5));
      
        int num = 15;
        System.out.println(num + " is " + (num % 2 == 0 ? "EVEN" : "ODD"));
        
        System.out.println("AND (true && false): " + (true && false));
        System.out.println("OR (true || false): " + (true || false));
    }
}