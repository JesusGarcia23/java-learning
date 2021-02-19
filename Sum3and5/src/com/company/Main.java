package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int numbersCount = 0;
        for (int i = 0; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number is " + i);
                sum += i;
                numbersCount++;
            }

            if (numbersCount == 5) {
                break;
            }
        }

        System.out.println("Total sum is " + sum);
    }
}
