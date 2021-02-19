package com.company.Methods;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstResult = getDurationString(65, 60);
        System.out.println(firstResult);

        String secondResult = getDurationString(3600);
        System.out.println(secondResult);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = 0;

        if (minutes < 0 || (seconds < 0 || seconds > 60)) {
            return "Invalid value";
        }

        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;

        }

        if (minutes >= 60) {
            hours = minutes / 60;
            minutes = minutes % 60;
        }

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds) {

        int minutes = 0;

        if (seconds < 0) {
            return "Invalid value";
        }

        minutes = seconds / 60;
        seconds = seconds % 60;


        return getDurationString(minutes, seconds);
    }
}
