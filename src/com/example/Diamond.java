package com.example;


public class Diamond {
    public static void main(String[] args) {
        printDiamond(3);
    }

    static void printDiamond(int n) {
        for (int i = 2; i < n; i += 2) {
            for (int j = 0; j < 3 - i / 2; j++)
             System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
    }

        for (int i = 5; i > 0; i -= 2) {
            for (int j = 0; j < 3 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }


}
