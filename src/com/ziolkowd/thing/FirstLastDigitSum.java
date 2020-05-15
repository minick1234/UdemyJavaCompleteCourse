package com.ziolkowd.thing;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int digits = 0;
        String reverseNumber = "";

        //Do this because 0 plus 0 is still 0 anyways!
        if (number == 0) {
            return 0;
        }

        while (number > 0) {
            digits = number % 10;
            number /= 10;
            reverseNumber += Integer.toString(digits);
        }
        int digit1 = Integer.parseInt(String.valueOf(reverseNumber.charAt(0)));
        int digit2 = Integer.parseInt(String.valueOf(reverseNumber.charAt(reverseNumber.toCharArray().length - 1)));
        return (digit1 + digit2);
    }
}
