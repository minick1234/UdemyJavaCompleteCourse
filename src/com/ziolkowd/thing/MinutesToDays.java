package com.ziolkowd.thing;

class myMinutesToDaysMain {
    public static void main(String[] args) {
        MinutesToDays.printYearsAndDays(-525600);
    }
}

public class MinutesToDays {
    public static void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid Value");
            return;
        }
        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long remainingDays = day % 365;
        System.out.println(minutes + " min = " + year + " years, " + remainingDays + " days");
    }
}
