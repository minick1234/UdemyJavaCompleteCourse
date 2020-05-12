package com.ziolkowd.thing;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2; // This is 1 + 2 = 3
        int result2 = 3; // this is the same thing
        System.out.println("The result of 1 + 2 is " + result);

        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1; // Result is going to be 3 - 1 = 2
        System.out.println("New Result = " + result);
        result *= 10; // This sets the result to 10 times itsself!
        System.out.println("2 * 10 = " + result);
        result /= 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //The remainder of 4 % 3 = 1 , 3 only goes into 4 once with 1 remainder!
        System.out.println("4 % 3 =" + result);

        //Result = result + 1;
        // Result++ is the same things
        // or
        // result += 1      //Can do the same for all mathematic operation types!

        boolean isALien = false;
        if (!isALien) {
            System.out.println("This is not a alien! Boring...");
        } else {
            System.out.println("OMG THIS IS AN ALIEN!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("This is the High Score value!!");
        } else {
            System.out.println("This is not equal to the High score value");
        }

        //single & or | is an bitwise operator working for the bit level!
        //Where as && and || is a logical operator checking true or false conditions!
        int secontTopScore = 81;
        if ((topScore > 90) || (secontTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        } else if ((topScore > 90) && (secontTopScore <= 90)) {
            System.out.println("Both of the conditions must be true!");
        }

        //A single equal is used always for assiging a value to something rather then doing comparisons!
        int newValue = 50;
        //For primitive values always use double equals to check conditions but for objects we use the .equals!
        if (newValue == 50) {
            System.out.println("This is the true value!");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("This is true and is allowed to happen!");
        }

        //This is called a ternary operation!
        // blah = someTypeOfThingToCompare ? TheTrueValue : TheFalseValue;
        boolean wasCar = isCar;
        if (wasCar) {
            System.out.println("This is true!"); // Should be this because the is car was true before!
        } else {
            System.out.println("This is false");
        }
    }

}
