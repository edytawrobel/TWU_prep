package com.PrimeFactors;

public class PrimeFactor {
    public static void main(String[] args) {
        generate(30);
    }

    static void generate(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                System.out.println(i);
            }
            if (n == 0) {
                continue;
            }

        }
    }
}

