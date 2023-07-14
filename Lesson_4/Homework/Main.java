package Lesson_4.Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 11; i >= 10; i--) {
            integerList.add(i);
            doubleList.add((double) i);
            stringList.add(String.valueOf(i));
        }

        System.out.println("Сложение чисел типа 'int' = " + calc.sum(integerList));
        System.out.println("Сложение чисел типа 'double' = " + calc.sum(doubleList));
        System.out.println();

        System.out.println("Умножение чисел типа 'int' = " + calc.mul(integerList));
        System.out.println("Умножение чисел типа 'double' = " + calc.mul(doubleList));
        System.out.println();

        System.out.println("Деление чисел типа 'int' = " + calc.div(integerList));
        System.out.println("Деление чисел типа 'double' = " + calc.div(doubleList));
        System.out.println();

        System.out.println("Число в двоичной системе счисления типа 'int': " +  calc.binary(integerList));
        System.out.println("Число в двоичной системе счисления типа 'string': " +  calc.binary(stringList));
    }
}