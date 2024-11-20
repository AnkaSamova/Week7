package ru.itgirlschool.week7.task3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "hello world";
        characterCounter(s);
    }

    public static void characterCounter(String s) {
        HashMap<Character, Integer> letters = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            letters.compute(c, (k, count) -> (count == null) ? 1 : count + 1);
        }

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}