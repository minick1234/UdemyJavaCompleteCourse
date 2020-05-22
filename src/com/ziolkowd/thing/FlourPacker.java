package com.ziolkowd.thing;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int goalBigBags = goal / 5;
        int goalSmallBags = 0;

        if (goalBigBags > bigCount) {
            goalSmallBags = ((goalBigBags - bigCount) * 5) + (goal % 5);
        } else if (goalBigBags <= bigCount) {
            goalSmallBags = (goal % 5);
        }
        return goalSmallBags <= smallCount;
    }
}