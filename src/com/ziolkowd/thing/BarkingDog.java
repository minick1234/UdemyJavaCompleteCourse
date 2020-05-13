package com.ziolkowd.thing;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isCurrentlyBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (isCurrentlyBarking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }
}
