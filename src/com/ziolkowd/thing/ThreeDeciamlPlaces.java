package com.ziolkowd.thing;

class mainDecimalPlace {
    public static void main(String[] args) {
        System.out.println("Are they close to three decimal places: " + ThreeDeciamlPlaces.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}

public class ThreeDeciamlPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 = (int) (num1 * 1000);
        num2 = (int) (num2 * 1000);

        num1 /= 1000;
        num2 /= 1000;

        return Double.compare(num1, num2) == 0;
        //return Math.abs(num1 - num2) <= 0.001;
    }
}
