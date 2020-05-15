package com.ziolkowd.thing;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Dom", 500);
        newScore = calculateScore(900);
        calculateScore();

        double theScore = calcFeetAndInchesToCentimeters(4, 5);
        //theScore = calcFeetAndInchesToCentimeters(5);

        if (theScore < 0.0) {
            System.out.println("Invalid Parameters this is not allowed!");
        }
        calcFeetAndInchesToCentimeters(157);
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
        if (inches < 0) {
            System.out.println("Invalid inches was given!");
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

