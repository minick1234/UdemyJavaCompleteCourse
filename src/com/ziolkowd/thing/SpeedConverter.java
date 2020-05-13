package com.ziolkowd.thing;

class theMainThing {
    public static void main(String[] args) {
        SpeedConverter.printConversion(15);
    }
}

public class SpeedConverter {
    public static long toMilesPerHours(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHours(kilometersPerHour);

            System.out.println(kilometersPerHour + " km/h\n" + milesPerHour + " mi/h");
        }
    }
}

