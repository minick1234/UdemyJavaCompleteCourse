package com.ziolkowd.thing;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }
        String numArray1 = "";
        String numArray2 = "";
        int n1, n2;

        while (num1 > 0) {
            n1 = num1 % 10;
            num1 /= 10;
            numArray1 += Integer.toString(n1);
        }
        while (num2 > 0) {
            n2 = num2 % 10;
            numArray2 += Integer.toString(n2);
            num2 /= 10;
        }

        char[] num1Thing = numArray1.toCharArray();
        char[] num2Thing = numArray2.toCharArray();

        for (char firstNums : num1Thing) {
            for (char secondNums : num2Thing) {
                if (Integer.valueOf(firstNums) == Integer.valueOf(secondNums)) {
                    return true;
                }
            }
        }
        return false;
    }
}
