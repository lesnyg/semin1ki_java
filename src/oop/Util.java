package oop;

import java.util.Random;

public class Util {

    public static int random(int num) {
        return new Random().nextInt(num);
    }


    public static String intToString(int num) {
        return String.valueOf(num);
    }

    public static int stringToInt(String str) {
        return Integer.valueOf(str);
    }
}
