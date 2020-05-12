package com.ziolkowd.thing;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FloatingPointNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat decimalForm = new DecimalFormat("0.0000000");


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        double myMinFDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My Float minimum value: " + myMinFloatValue + " My Max Float value: " + myMaxFloatValue);
        System.out.println("My Double minimum value: " + myMinFDoubleValue + " My Max Double value: " + myMaxDoubleValue);


        //This just shows it prints this way no matter how you do it!
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        int myIntValue = 5 / 3;
        //float myFloatValue = 5.25f; // you can also cast it to a float and itll work  if you dont use any decimal numbers you dont need to add a f
        //double myDoubleValue = 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My Int Value = " + myIntValue + "\nMy Float Value = " + myFloatValue + "\nMy Double Value = " + myDoubleValue);

        System.out.println("****************************\nTHIS IS THE CHALLENGE\n**********************************");

        double pounds;
        double sumOfPounds;
        double kilogram_Base_Weight = 0.45359237d;

        System.out.println("Please enter the number of pounds to convert to kilograms: ");
        pounds = s.nextDouble();

        sumOfPounds = pounds * kilogram_Base_Weight;
        System.out.println("The number of " + pounds + " pounds to kilograms is =" + decimalForm.format(sumOfPounds));


    }

}
