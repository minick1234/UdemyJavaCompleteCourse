package com.ziolkowd.thing;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else return summer && temperature >= 25 && temperature <= 45;
    }
}
