package com.ziolkowd.thing;

public class LastDigitChecker {
    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!(isValid(num1) && isValid(num2) && isValid(num3))) {
            return false;
        }
        int n1, n2, n3;
        String numString1 = "", numString2 = "", numString3 = "";
        while (num1 > 0) {
            n1 = num1 % 10;
            numString1 += n1;
            num1 /= 10;
        }
        while (num2 > 0) {
            n2 = num2 % 10;
            numString2 += n2;
            num2 /= 10;
        }
        while (num3 > 0) {
            n3 = num3 % 10;
            numString3 += n3;
            num3 /= 10;

        }
        //Since they check the values in reverse order we check for the location 0 in this case to basically check the back!
        int lastDigit1 = numString1.charAt(0);
        int lastDigit2 = numString2.charAt(0);
        int lastDigit3 = numString3.charAt(0);
        //Return true if any of the following is indeed a case!
        return ((lastDigit1 == lastDigit2) || (lastDigit1 == lastDigit3) || (lastDigit3 == lastDigit2));
    }
}
