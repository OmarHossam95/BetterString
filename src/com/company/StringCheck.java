package com.company;

import java.util.stream.IntStream;

public class StringCheck {
    public static boolean checkString(String s){
        if (s == null) return false;
        if (s.isEmpty()) return false;

        return s.chars().allMatch(Character::isLetter);
    }
}
