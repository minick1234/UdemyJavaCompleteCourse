package com.ziolkowd.thing;

public class OperatorChallenge {
    public static void main(String[] args) {
        //This creates my two doubles!
        double myDouble = 20.00d;
        double myDouble2 = 80.00d;

        //This is the calculations
        myDouble += myDouble2;
        myDouble *= 100d;
        double remainderAmount = myDouble % 40.00d;

        //This does my condition checks for remainders
        boolean GotSomeTypeOfRemainder = myDouble == 0.00d;

        //You can also do this check by doing
        //  // This will work the same way!
        //  Only difference is boolean would first need to be created still and initialized a value!
        /*  if (myDouble == 0) {
                GotSomeTypeOfRemainder = true;
                }
                else if (myDouble != 0) {
                    GotSomeTypeOfRemainder = false;
                }
        */
        //This outputs the boolean results!
        System.out.println("Checks if we have some remainder or not: " + GotSomeTypeOfRemainder);
        System.out.println("The value of the variable total is : " + myDouble);
        System.out.println("The remainder amount is: " + remainderAmount);

        //If the results were false we print this message to let the user know there is some remainder!
        if (GotSomeTypeOfRemainder) {
            System.out.println("Got some type of remainder!");
        }


    }

}
