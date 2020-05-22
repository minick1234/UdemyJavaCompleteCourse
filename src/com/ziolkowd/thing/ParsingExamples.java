package com.ziolkowd.thing;

public class ParsingExamples {
    public static void main(String[] args) {

        //If i was to put a string value here and then try to parse it such as 2020a it would throw a numberformat exception since
        //A cannot be converted to a int and so itll give us a error if we try to parse this value.
        //This applies for doubles, floats and everything else that uses primitive data types!

        String numberAsString = "2020";
        System.out.println("The number as a string = " + numberAsString);
        //Whenever going from a string to something we need to parse,
        //when converting from normal primitive data types then we use cast
        //Parsing is usually used for object types to convert to another type!
        int myNewInt = Integer.parseInt(numberAsString);
        System.out.println("The new number as a int parsed is: " + myNewInt);

        numberAsString += 1;
        myNewInt += 1;

        //Since this is concatinating the string it adds the one as a extra piece of string to the end of the value
        System.out.println("Number as a string value = " + numberAsString);
        //Whereas this is parsed as a type int so the value is added on to the 2020 and becomes 2021 instead!
        System.out.println("Number as a parsed int value = " + myNewInt);


    }

}

