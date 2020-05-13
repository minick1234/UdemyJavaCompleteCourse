package com.ziolkowd.thing;

class equalSumCheckMain {
    public static void main(String[] args) {
        System.out.println("The sum is: " + EqualSumChecker.hasEqualSum(1, 1, 3));
    }
}

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}
