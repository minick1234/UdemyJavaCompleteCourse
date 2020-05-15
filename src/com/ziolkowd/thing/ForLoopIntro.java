package com.ziolkowd.thing;

public class ForLoopIntro {

    public static void main(String[] args) {

        /**
         * For(initialization; termination; incrementation)
         * {
         * // the actions
         * }
         */

        for (int i = 1; i <= 8; i++) {
            //The string format converts the number to a 2 decimal output and makes it a one decimal point if it doesnt need more!!
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        System.out.println("****************BACKWARDS****************");
        //Same thing as above but backwards
        for (int i = 8; i > 0; i--) {
            //The string format converts the number to a 2 decimal output and makes it a one decimal point if it doesnt need more!!
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("\n");
        Find3PrimeNumbers(45, 5);
    }

    public static void Find3PrimeNumbers(int numberOfTimeToLoop, int numToStartCountAt) {
        if (numToStartCountAt >= numberOfTimeToLoop) {
            System.out.println("This is invalid, Number to start at cannot be more then than the loop amount!");
            return;
        }

        int numberOfPrimesFound = 0;
        for (int i = numToStartCountAt; i < numberOfTimeToLoop; i++) {
            if (numberOfPrimesFound >= 3) {
                System.out.println("Exiting the loop!");
                break;
            }
            if (isPrime(i)) {
                System.out.println(i);
                numberOfPrimesFound++;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        //Go over the numbers and find out which one is even, if we find one that is a even number then its not prime!
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //If none of the above were true and no even numbers could be found we return true
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
