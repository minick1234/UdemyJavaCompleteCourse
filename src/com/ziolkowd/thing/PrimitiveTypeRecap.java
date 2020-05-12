package com.ziolkowd.thing;

public class PrimitiveTypeRecap {
    public static void main(String[] args) {
        //Byte
        //Short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //A string is not a primitive type its a data type meaning it is a object that requires an instance
        String myString = "This is my string value.";
        System.out.println("My string is equal too = " + "'" + myString + "'");
        myString += " This is more stuff on the my String";
        System.out.println("My string is now equal too = " + "'" + myString + "'");
        myString += "  \u00aa9 2020";
        System.out.println("My string is now equal too = " + "'" + myString + "'");

        //This is a example to show that the numbers wont add because they are of type string and not int!
        String numberString = "250.55";
        String numberString2 = "205.99";
        String totalNumberString = numberString + numberString2;
        System.out.println("This is my number String value:" + totalNumberString);

        //Same type of example because the last string of 10 is still a string and never was convereted so java is smart enough to keep it a string!
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("This is the value of last string: " + lastString);
        //Same type of example because the last string of 10 is still a string and never was convereted so java is smart enough to keep it a string!
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("This is the value of last String now with a double: " + lastString);


    }

}
