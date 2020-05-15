package com.ziolkowd.thing;

import java.util.ArrayList;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        System.out.println("\n******************");
        numberToWords(1010);
        System.out.println("\n******************");
        numberToWords(1000);
        System.out.println("\n******************");
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("ZERO ");
        }
        ArrayList<Integer> NumsInWord = new ArrayList<>();
        for (int i = 0; (number != 0); i++) {
            NumsInWord.add(number % 10);
            number /= 10;

            switch (NumsInWord.get(i)) {
                case 0:
                    System.out.print("ZERO ");
                    break;
                case 1:
                    System.out.print("ONE ");
                    break;
                case 2:
                    System.out.print("TWO ");
                    break;
                case 3:
                    System.out.print("THREE ");
                    break;
                case 4:
                    System.out.print("FOUR ");
                    break;
                case 5:
                    System.out.print("FIVE ");
                    break;
                case 6:
                    System.out.print("SIX ");
                    break;
                case 7:
                    System.out.print("SEVENS ");
                    break;
                case 8:
                    System.out.print("EIGHT ");
                    break;
                case 9:
                    System.out.print("NINE ");
                    break;
            }
        }
    }
}
