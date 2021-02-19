package com.company.Methods;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        displayHighScorePosition("Jesus",calculateHighScorePosition(1500));
        displayHighScorePosition("Pedro",calculateHighScorePosition(900));
        displayHighScorePosition("Alex",calculateHighScorePosition(400));
        displayHighScorePosition("Miguel",calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }else{
            return -1;
        }
    }

    // Create a method called displayHighScorePosition
    // it should accept players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table ".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an int
    // the return data should be
    // 1 if score is > 1000
    // 2 if the score is > 500 and < 1000
    // 3 if the score is > 100 < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400, and 50

    public static void displayHighScorePosition(String name, int highScorePosition){
        System.out.println(name + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        }else if(score >= 500){
            return 2;
        }else if(score >= 100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
