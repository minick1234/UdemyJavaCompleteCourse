package com.ziolkowd.thing;

public class KeyWordsAndExpressions {
    public static void main(String[] args) {
        //Cant do this because int is a already taken word, So make sure to never ever use
        //A reserved keyword!
        //int int = 5;

        //This is valid tho because int2 is not reserved!
        int int2 = 5;

        //Expressions are the building blocks of java, built with values, method calls, and references.
        //To create a expression from miles to kilometers we need to know firstly
        //A mile is equal to 1.609344 kilometres
        double kilometeerx_ConversionNumber = (100 * 1.609344);

        //These 3 things are expressions, first is assignment, second is a logical check, third is a reference/call
        int highScore = 50;
        System.out.println("This is an expression!");

        int score = 100; // This is an expression
        if (score > 99) { // This is an expression
            System.out.println("You got the highScore!"); // This is an expression
            score = 0; // This is an expression
        }
    }
}
