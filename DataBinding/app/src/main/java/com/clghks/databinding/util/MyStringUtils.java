package com.clghks.databinding.util;

/**
 * Created by chihwan on 15. 11. 9..
 */
public class MyStringUtils {
    public static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }
}
