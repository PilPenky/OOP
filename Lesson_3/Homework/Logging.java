package Lesson_3.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Logging {
    List<String> logging = new ArrayList<>();
    public void recLogging(String value) {
        DateL date = new DateL();
        String valueUser = "\n" + value + " - " + date.Date();
        logging.add(valueUser);
    }

    @Override
    public String toString() {
        return logging.toString();
    }

    public void InterfaceLogging(){
        System.out.println("Для просмотра логирования действий нажмите цифру <1>: ");
        Scanner scannerNum = new Scanner(System.in);
        Integer numTwo = scannerNum.nextInt();
        if(numTwo.equals(1)){
            System.out.println(logging.toString().replaceAll("^\\[|\\]$", ""));
        }

    }
}
