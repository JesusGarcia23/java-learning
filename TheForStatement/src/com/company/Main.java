package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% rate interest = " + calculateInterest(10000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        // and print the results to the console window.

        for (int j = 2; j < 9; j++) {
            System.out.println("10,000 at " + j + "% rate interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
        }

        for (int j = 8; j > 1; j--) {
            System.out.println("10,000 at " + j + "% rate interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a Prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: Use the break; statement to exit
        int countPrime = 0;

        for (int i=0; i < 9; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                countPrime++;
            }

            if(countPrime == 3) {
                break;
            }

        }
    }


    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}
