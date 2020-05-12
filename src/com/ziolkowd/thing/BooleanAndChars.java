package com.ziolkowd.thing;

public class BooleanAndChars {
    public static void main(String[] args) {

        //This is always single character unlike a string which is basically multicharacter!
        char myChar = 'd';
        System.out.println("Normal char: " + myChar);

        //This is a uppercase d using the unicode!
        char myUnicodeChar = '\u0044';
        System.out.println("My Unicode Char: " + myUnicodeChar);

        //This is the copyright symbol using the unicode
        char myCopyRightChar = '\u00A9';
        System.out.println("This is my copyright Char: " + myCopyRightChar);

        //Best way to add booleans is by using a question such as "is"...
        //this way it makes it easier to think of logic for it!
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;


    }
}
