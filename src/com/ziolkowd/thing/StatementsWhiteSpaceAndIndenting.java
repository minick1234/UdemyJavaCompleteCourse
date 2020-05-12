package com.ziolkowd.thing;

public class StatementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        //The entire line is a statement whereas the myVariable = 50; thats the expression
        int myVariable = 50;
        //This is auto indented by java using the formatter. Indenting and formatting makes it easier to read
        // and plan out the knowledge!
        if (myVariable == 50) {
            System.out.println("This is the thing printed!");
        }
        //The semicolon makes a java line a statement usually and the content or the actual values are the expressions!

        //These are also statements
        myVariable++;
        myVariable--;

        //This whole line is the statement!
        System.out.println("This is the actual expression");

        System.out.println("This is "
                + "another, " +
                ", and still more.");

        //This can be done on the same line but even java will seperate the two lines if the variables are on the same line!
        int anotherVariable = 5;
        myVariable--;


    }

}
