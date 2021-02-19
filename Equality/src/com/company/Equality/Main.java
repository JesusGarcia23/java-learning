package com.company.Equality;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);

        // THIS WILL RETURN FALSE
        if(f1 == f2) {
            System.out.println("They're same");
        }

        // THIS WILL RETURN TRUE
        if(f1.equals(f2)) {
            System.out.println("They're same");
        }
            }
}
