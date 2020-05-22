package com.ziolkowd.thing;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.print("Zero ");
            return;
        }
        int timeToDoIt = getDigitCount(number);
        number = reverse(number);
        int[] NumsInWord = new int[timeToDoIt];
        for (int i = 0; (timeToDoIt > 0); i++) {
            NumsInWord[i] = (number % 10);
            number /= 10;
            switch (NumsInWord[i]) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            timeToDoIt--;
        }
    }

    public static int reverse(int number) {
        if (number == 0) {
            return 0;
        }
        String reverseNumber = "";
        if (number <= 0) {
            int digits;
            number *= -1;
            while (number != 0) {
                digits = number % 10;
                reverseNumber += Integer.toString(digits);
                number /= 10;
            }
            return Integer.parseInt(reverseNumber) * (-1);
        } else {
            int digits;
            while (number != 0) {
                digits = number % 10;
                reverseNumber += Integer.toString(digits);
                number /= 10;
            }
            return Integer.parseInt(reverseNumber);
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int n1 = 0;
        String numArrayInt = "";

        if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                n1 = number % 10;
                numArrayInt += Integer.toString(n1);
                number /= 10;
            }
            return numArrayInt.toCharArray().length;
        }
    }
}
