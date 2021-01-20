package com.mycompany.esercizio2_tpsit;

public class NumberHelper {

    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        // ritorna true se number numero pari, altrimenti ritorna false
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if (number % 2 != 0) {
            return true;
        }
        return false;
    }

    public int sum(int n) {
        // ritorna la somma tra number e n
        return number + n;
    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false
        for (int i = number; i < 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        if (n == 0) {
            return false;
        } else if (number % n == 0) {
            return true;
        } else {
            return false;
        }
    }
}
