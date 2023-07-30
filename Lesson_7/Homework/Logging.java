package Lesson_7.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logging {
    List<String> log = new ArrayList<>();
    int index = 1;

    public void recLogging(String valueOne, String sign, String valueTwo, String result) {
        String valueUser = "\n" + index + ". " + valueOne + " " + sign + " " + valueTwo + " = " + result;
        log.add(valueUser);
        index++;
    }

    @Override
    public String toString() {
        return log.toString();
    }

    public void interfaceLogging() {
        System.out.printf("Для просмотра логирования действий нажмите цифру <1>: ");
        Scanner scannerNum = new Scanner(System.in);
        Integer numTwo = scannerNum.nextInt();
        if (numTwo.equals(1)) {
            System.out.println("История пользования калькулятором:");
            System.out.println(log.toString().replaceAll("^\\[|\\]$", ""));
        }
    }
}
