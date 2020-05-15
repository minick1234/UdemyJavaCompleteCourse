package com.ziolkowd.thing;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits is : " + sumDigits(125));
        System.out.println("The sum of the digits is : " + sumDigits(-125));
        System.out.println("The sum of the digits is : " + sumDigits(5));
        System.out.println("The sum of the digits is : " + sumDigits(450555));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }
        return sum;
    }

}
