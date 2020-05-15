package com.ziolkowd.thing;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        int[] numArray = new int[number];

        for (int i = 1; i < number - 1; i++) {
            if (number % i == 0) {
                numArray[i] = i;
            }
            sum += numArray[i];
            if (sum == number) {
                return true;
            }
        }
        return false;
    }
}
