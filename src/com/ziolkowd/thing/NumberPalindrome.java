package com.ziolkowd.thing;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int digits = 0;
        int counter = 0;
        int oldNumber = number;
        String reverseNumber = "";

        if (number > 0) {
            while (number != 0) {
                counter++;
                digits = number % 10;
                System.out.println("Digit " + counter + ": " + digits);
                reverseNumber += Integer.toString(digits);
                number /= 10;
            }
            return oldNumber == Integer.parseInt(reverseNumber);
        } else {
            number *= -1;
            while (number != 0) {
                counter++;
                digits = number % 10;
                System.out.println("Digit " + counter + ": " + digits);
                reverseNumber += Integer.toString(digits);
                number /= 10;

            }
            int reversedIntReversed = Integer.parseInt(reverseNumber);
            reversedIntReversed *= -1;
            return oldNumber == reversedIntReversed;
        }
    }
}
