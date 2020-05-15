package com.ziolkowd.thing;

public class Sum3And5Challenge {
    public static void main(String[] args) {
        sumAllNumbers(45);
    }

    public static void sumAllNumbers(int numToStartAt) {
        int sum = 0;
        int counterOfNumsFound = 0;
        for (int i = numToStartAt; i <= 1000; i++) {
            if (counterOfNumsFound >= 5) {
                break;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("The number that is divisible by 3 or 5 is: " + i);
                sum += i;
                counterOfNumsFound++;
            }
        }
        System.out.println("The sum of all those numbers added together is: " + sum);
    }
}
