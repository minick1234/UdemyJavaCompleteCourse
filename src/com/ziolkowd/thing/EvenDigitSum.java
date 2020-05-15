package com.ziolkowd.thing;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int numThing;
        while (number > 0) {
            numThing = number % 10;
            number /= 10;
            if (numThing % 2 == 0) {
                sum += numThing;
            }
        }
        return sum;
    }
}
