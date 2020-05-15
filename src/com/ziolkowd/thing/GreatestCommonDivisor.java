package com.ziolkowd.thing;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int numToReturn = 0;

        for (int i = 2; (i <= first && i <= second); i++) {
            if ((first % i == 0) && (second % i == 0)) {
                numToReturn = i;
            }
        }
        return numToReturn;
    }
}

//This is another way to do it!
//int counter = 2;
//        do {
//            if ((first % counter == 0) && (second % counter == 0)) {
//                numToReturn = counter;
//            }
//            counter++;
//        } while (counter < first && counter < second);
//        return numToReturn;
//