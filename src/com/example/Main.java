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


}
