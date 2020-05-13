package com.ziolkowd.thing;

class teenMainChecker {
    public static void main(String[] args) {
        System.out.println("Is one of this a teen: " + TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println("Is this a teen single: " + TeenNumberChecker.isTeen(15));
    }
}

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19);
    }

    public static boolean isTeen(int num1) {
        return num1 >= 13 && num1 <= 19;
    }
}
