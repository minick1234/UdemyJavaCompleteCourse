package com.ziolkowd.thing;

class isItALeapYearMain {
    public static void main(String[] args) {
        System.out.println("Is it a leap Year: " + LeapYearCalculator.isLeapYear(2000));
    }
}

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }

        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                return (year % 400 == 0);
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
