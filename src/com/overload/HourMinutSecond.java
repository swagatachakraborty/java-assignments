package com.overload;

public class HourMinutSecond {
    public static void main(String[] args) {
        System.out.println(getDurationString(-5,6));
        System.out.println(getDurationString(9,-3));
        System.out.println(getDurationString(9,64));
        System.out.println(getDurationString(9,9));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
    }

    public static String getDurationString(int minutes, int second) {
        if ( minutes < 0 || second < 0 || second > 59) {
            return "Invalid value";
        }
        int secondsInDuration = second % 60 ;
        String secondsInDurationString = "" + secondsInDuration;

        if (secondsInDuration < 10) {
            secondsInDurationString =  "0" + secondsInDuration;
        }

        int minutesInDuration = (minutes + second / 60) % 60;
        String minutesInDurationString = "" + minutesInDuration;

        if (secondsInDuration < 10) {
            minutesInDurationString =  "0" + secondsInDuration;
        }

        int hoursInDuration = (minutes + second / 60) / 60;
        String hoursInDurationString = "" + hoursInDuration;

        if (secondsInDuration < 10) {
            hoursInDurationString =  "0" + secondsInDuration;
        }

        String durationString = hoursInDurationString + "h" + minutesInDurationString + "m" + secondsInDurationString + "s" ;
        return durationString;
    }

    public static String getDurationString(int second) {
        if ( second < 0 ) {
            return "Invalid value";
        }
        int secondsInDuration = second % 60;
        int minutesInDuration = second / 60 ;
        return getDurationString( minutesInDuration, secondsInDuration);
    }

}
