package com.ziolkowd.thing;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(10, 5));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start || end < 0) || (start < 0)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
