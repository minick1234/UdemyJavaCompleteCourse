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

        //Uncommented this returns a error because you cant set it out of the length possible, so this shows how when during the sout above it auto inverts the numbers but if i try to pass it in general it wont work!
        //int maxIntTest = 2147483648;

        //You can also use _ in between numbers and it will still work and process the number, see the sout below. When run, it prints out the number without the underscores!
        /* this still passes which is wild! */
        int maxIntTest = 214_748_3647;
        System.out.println(maxIntTest);

    }
}
