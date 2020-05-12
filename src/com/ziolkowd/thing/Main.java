package com.ziolkowd.thing;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dominik");
        String name = "Cock";
        System.out.println("The name is now known as : " + name);

        //Example of using variables and passing them and manipulating them, and eventually printing out those numbers
        int myFirstNumber = 12;
        int mySecondNumber = 6;
        int myThirdNumber = (myFirstNumber + mySecondNumber) + (myFirstNumber * mySecondNumber);
        int sumOfAll = (int) Math.pow(Math.sqrt(myThirdNumber), 2);
        System.out.println(sumOfAll);
        int myLastOne = 1000 - sumOfAll;
        System.out.println(myLastOne);

        //Assign 2 primitive int values the max and min value possible
        int myValue1 = Integer.MAX_VALUE;
        int myValue2 = Integer.MIN_VALUE;
        System.out.println("The max value of int is :" + myValue1 + "my min value of int is :" + myValue2);

        //These 2 things basically do the opposite number because back to math in first sem , the overflow of a number changes it to the opposite of the value
        System.out.println("This is a example of something called a overflow for the max value : " + (myValue1 + 1));
        System.out.println("This is a example of something called a overflow for the min value : " + (myValue2 - 1));
        System.out.println("-----------------------------------------------------------------------");

        //Uncommented this returns a error because you cant set it out of the length possible, so this shows how when during the sout above it auto inverts the numbers but if i try to pass it in general it wont work!
        //int maxIntTest = 2147483648;

        //You can also use _ in between numbers and it will still work and process the number, see the sout below. When run, it prints out the number without the underscores!
        /* this still passes which is wild! */
        int maxIntTest = 214_748_3647;
        System.out.println(maxIntTest);

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("My Max byte value: " + myMaxByteValue);
        System.out.println("My Min byte value: " + myMinByteValue);
        System.out.println("The max value of byte is :" + myMaxByteValue + " my min value of byte is :" + myMinByteValue);
<<<<<<< HEAD
        System.out.println("-----------------------------------------------------------------------");

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("My Max Short value: " + myMaxShortValue);
        System.out.println("My Min Short value: " + myMinShortValue);
        System.out.println("The max value of Short is :" + myMaxShortValue + " my min value of Short is :" + myMinShortValue);
        System.out.println("-----------------------------------------------------------------------");

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("My Max Short value: " + myMaxLongValue);
        System.out.println("My Min Short value: " + myMinLongValue);
        System.out.println("The max value of Short is :" + myMaxLongValue + " my min value of Short is :" + myMinLongValue);
=======

        System.out.println("This is a example of something called a overflow for the max value : " + (myMaxByteValue + 1)); // This doesnt exist for bytes because after this is becomes a int!
        System.out.println("This is a example of something called a overflow for the min value : " + (myMinByteValue - 1)); // This doesnt exist for bytes because after this is becomes a int!

        //This can be done with no casting!
        int myTotal = (myValue1 / 2);
        int myTotal2 = (myValue2 / 2);
>>>>>>> e87a12205bdf7408d01e04b9b8efc88bb8702bb4


        //Cast this to a byte because we used a integer type -
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myMinShortValue = Short.MIN_VALUE;

        //Cast this to a short because the division makes it a type integer so we need to cast back to a short-
        short myNewShortValue = (short) (myMinShortValue / 2);

        //THIS WAS SOME TYPE OF SMALL EASY CHALLENGE!
        byte myByteVariable = 15;
        short myShortVariable = 10;
        int myIntVariable = 22;

        long myLongVariable = 50000L + (10L * (myByteVariable + myShortVariable + myIntVariable));
        System.out.println("The answer to the problem is: " + myLongVariable);

        //This needs to be casted because we are trying to convert a type of int cause all the numbers get converted to that, to a short
        //This means we need to cast back to a short!
        short shortTotal = (short) (1000 + 10 * (myByteVariable + myShortVariable + myIntVariable));
        System.out.println("This is the answer for the casted short: " + shortTotal);
    }
}
