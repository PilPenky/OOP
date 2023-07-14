package Lesson_3.Homework;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println( "Игра Быки и Коровы\n1 - играть с числами;\n2 - играть с буквами русского алфавита" +
                            "\n3 - играть с буквами английского алфавита");
        System.out.print("<<Укажите нужный пункт>>: ");
        Scanner scannerNum = new Scanner(System.in);
        Integer num = scannerNum.nextInt();

        GameStart gameStart = new GameStart();
        gameStart.GameSS(num);
    }
}