package com.company.Methods;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(5);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        }
        System.out.println((inches + (feet * 12)) * 2.54);
        return (inches + (feet * 12)) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0 || inches > 12) {
            return -1;
        }
        System.out.println(calcFeetAndInchesToCentimeters(inches / 12, inches));
        return calcFeetAndInchesToCentimeters(inches / 12, inches);
    }
}
