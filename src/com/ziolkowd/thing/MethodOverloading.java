package com.ziolkowd.thing;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Dom", 500);
        newScore = calculateScore(900);
        calculateScore();

        double theScore = calcFeetAndInchesToCentimeters(0, 5);
        theScore = calcFeetAndInchesToCentimeters(5);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + "\nscored: " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Player: " + "*UNKNOWN_PLAYER*" + "\nscored: " + score + " points!");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player!\nNo Score");
    }
    //Or
/*
    public static int calculateScore() {
        System.out.println("No player!\nNo Score");
        return 0;
    }
*/

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0) && !(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid feet or inches was given!");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println("Feet: " + feet + " Inches: " + inches + " = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (!(inches >= 0 && inches <= 12)) {
            System.out.println("Invalid inches was given!");

            return -1;
        }
        double centimeters = inches * 2.54;
        System.out.println("Inches:" + inches + " = " + centimeters + " cm ");
        return centimeters;
    }
}

