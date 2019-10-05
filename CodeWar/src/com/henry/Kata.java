package com.henry;

public class Kata {
    public static String HighAndLow(String number) {
        String str[] = number.split(" ");
        Integer ints[] = new Integer[str.length];
        for (int i = 0; i < str.length; i++) {
            ints[i] = Integer.parseInt(str[i]);
        }
        Integer min = ints[0];
        Integer max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] > max) {
                max = ints[i];
            }
        }
        return max.toString() + " " + min.toString();
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder str = new StringBuilder();
        int time = 0;
        while (time < repeat) {
            for (int i = 0; i < string.length(); i++) {
                str.append(string.charAt(i));
            }
            time++;
        }
        return str.toString();
    }
}
