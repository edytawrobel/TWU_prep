package com.fizzbuzz;


public class FizzBuzz {

    public static void main(String[] args) {
        getResult();


    }

    static void getResult() {
        for (int i = 0; i < 101; i ++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}


