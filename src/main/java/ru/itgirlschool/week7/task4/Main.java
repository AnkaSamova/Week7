package ru.itgirlschool.week7.task4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(201) - 100);
        }
        System.out.println(numbers);
        removeEvenNumbers(numbers);
    }

    public static void removeEvenNumbers(LinkedList<Integer> numbers) {
        Iterator<Integer> element = numbers.iterator();
        while (element.hasNext()) {
            if (element.next() % 2 == 0) {
                element.remove();
            }
        }
        System.out.println("Связный список после удаления четных чисел:");
        System.out.println(numbers);
    }
}