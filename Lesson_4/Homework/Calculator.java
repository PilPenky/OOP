package Lesson_4.Homework;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /**
     * @param numbers массив чисел
     * @return сумма всех элементов
     * @apiNote 1. Расширить класс калькулятор на умножение;
     * 2. Расширить класс калькулятор на деление;
     * 3. Расширить класс калькулятор на бинарный перевод (принимаемые значения как стринг, так и инт).
     */

    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    public Double mul(List<? extends Number> numbers) {
        Double res = 1.0;
        for (Number number : numbers) {
            res *= number.doubleValue();
        }
        return res;
    }

    public Double div(List<? extends Number> numbers) {
        Double res = 1.0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) res = numbers.get(i).doubleValue() / res;
            else res /= numbers.get(i).doubleValue();
        }
        return res;
    }

    public <T> String binary(List<T> numbers) {
        String binaryNumber = new String();
        List<Integer> num = new ArrayList<>();

        if (numbers.get(0) instanceof String) {
            numbers.toString().split("");
            for (int i = 0; i < numbers.size(); i++) {
                num.add(Integer.parseInt((String) numbers.get(i)));
            }
        }

        if(num.isEmpty()) num = (List<Integer>) numbers;

        for (int i = 0; i < num.size(); i++) {
            int temp = (int) num.get(i);
            while (temp > 0) {
                binaryNumber = (temp % 2) + binaryNumber;
                temp = (int) (temp / 2);
            }
            binaryNumber = " " + binaryNumber;
        }
        return binaryNumber;
    }
}