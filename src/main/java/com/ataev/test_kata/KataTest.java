package com.ataev.test_kata;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class KataTest {
    public static void main(String[] args) {
        System.out.println(getCount(null));

    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        if(str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                        str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    ++vowelsCount;
                }
            }
        }
        return vowelsCount;
    }
    public static int getCount1(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }
}