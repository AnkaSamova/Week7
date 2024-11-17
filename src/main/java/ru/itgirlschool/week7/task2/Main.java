package ru.itgirlschool.week7.task2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(bracket(s));
    }

    public static boolean bracket(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && ((c == ')' && stack.peek() == '(') || (c == '}' && stack.peek() == '{') || (c == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}