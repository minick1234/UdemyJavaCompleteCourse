package com.ziolkowd.thing;

public class WhileAndDoWhileIntro {

    public static void main(String[] args) {
        int count = 1;
        //This is run until its the condition met - 1, so when count is 5 its over!
        while (count != 6) {
            System.out.println("The count value: " + count);
            count++;
        }

        //This does the same thing if i didnt add the break though inisde it would be a
        // infinite loops since the condition being checked never goes to false!
//        int count2 = 1;
//        while (true) {
//            if (count2 == 6) {
//                break;
//            }
//            System.out.println("Count value is :" + count2);
//            count2++;
//        }

        //While doesnt have to run at least once, whereas a do while can run at least once before
        //Since we start it at 6 the while condition is never gonna be able to be met so this would
        // be a infinite loop, but since we have the check if its greater than 100 we can break and it will exit!
//        int count3 = 5;
//        do {
//            System.out.println("Count value was: " + count3);
//            count3++;
//            if (count3 > 100) {
//                break;
//            }
//        } while (count3 != 6);

        //Another example!
        int number = 4;
        int finishNumber = 20;
        int totalEven = 0;
        while (number <= finishNumber) {
            //If this is not a even number then skip it
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            if (totalEven >= 5) {
                break;
            }
            //If this is a even number print out the number, we dont have to worry about it being odd.
            //As the if statement above handles that and makes sure nothing odd is passed!
            System.out.println("Even number " + number);
            number++;
            totalEven++;
        }
        System.out.println("The total number of even numbers found: " + totalEven);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
