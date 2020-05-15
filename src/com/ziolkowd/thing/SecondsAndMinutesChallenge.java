package com.ziolkowd.thing;

class secondsAndMinutesMain {
    public static void main(String[] args) {
        System.out.println(SecondsAndMinutesChallenge.getDurationString(13, 55));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(345, 35));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(120, 15));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(120, 43));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(120));
        System.out.println(SecondsAndMinutesChallenge.getDurationString(9000));
    }
}

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value!";

    public static String getDurationString(long minutes, long seconds) {
        if (!(minutes >= 0) || !(seconds >= 0 && seconds <= 59)) {
            //This is commented belwo because its a example of something thats impossible because its a final constant!
            //INVALID_VALUE_MESSAGE = "blah you cant do this because its a constant!";
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;


        String hoursString = hours + "h ";
        String minuteString = remainingMinutes + "m ";
        String secondString = seconds + "s";

        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        if (remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }
        if (seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + minuteString + secondString;
    }

    public static String getDurationString(long seconds) {
        if (!(seconds >= 0)) {
            return "Invalid value was passed!";
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }
}
