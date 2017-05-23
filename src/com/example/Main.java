package com.example;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Main {

    public static void main(String[] args) {

        System.out.println("asterisk" );

        System.out.println('*');

        System.out.println("vertical line" );
        verticalLine(8);

        System.out.println("");
        System.out.println("horizontal line" );
        horizontalLine(3);

        System.out.println("");
        System.out.println("right triangle" );
        rightTriangle(3);
    }

    static void verticalLine(int n) {
        if (n > 0) {
            System.out.print('*');
            verticalLine(n-1);
        }
    }

    static void horizontalLine(int n) {
        for (int i=0; i < n; i++) {
            System.out.println('*');
        }
    }

    static void rightTriangle(int n) {
        for (int i=0; i < n; i++) {
            for (int k=0; k <= i; k++ ) {
                System.out.print('*');
            }
            System.out.println("");
        }

//        for (int i=0; i < n-2; i++) {
//            System.out.print('*');
//        }
//        System.out.println("");
//
//        for (int i=0; i < n-1; i++) {
//            System.out.print('*');
//        }
//        System.out.println("");
//
//        for (int i=0; i < n; i++) {
//            System.out.print('*');
//        }
//        System.out.println("");

    }


}
