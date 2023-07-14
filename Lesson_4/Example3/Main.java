package Lesson_4.Example3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>(); // джинерики работают с разными типами
        List<String> stringList = new ArrayList<>(); // джинерики работают с разными типами

        for (int i = 0; i < 100; i++) {
            doubleList.add((double) i);
            integerList.add(i);
            stringList.add(String.valueOf(i));
        }
        System.out.println("calc.sum(doubleList) = " + calc.sum(doubleList));
        System.out.println("calc.sum(integerList) = " + calc.sum(integerList));
        System.out.println("stringList = " + stringList); // не реализован парсинг строки
    }
}