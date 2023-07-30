package Lesson_7.Homework;

import Lesson_7.Homework.Calculable;
import Lesson_7.Homework.ICalculableFactory;
import Lesson_7.Homework.Logging;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        boolean flag = true;
        Logging logging = new Logging();
        while (flag) {
            String primaryArg = promptInt("Введите первое комплексное число: ");
            Calculable calculator = calculableFactory.create(primaryArg);

            String cmd = prompt("Введите команду (+, *, /) : ");
            if (cmd.equals("+")) {
                String arg = promptInt("Введите второе комплексное число: ");
                calculator.sum(arg);
                String result = calculator.getResult();
                logging.recLogging(primaryArg, cmd, arg, result);
            }
            if (cmd.equals("*")) {
                String arg = promptInt("Введите второе комплексное число: ");
                calculator.multi(arg);
                String result = calculator.getResult();
                logging.recLogging(primaryArg, cmd, arg, result);
            }
            if (cmd.equals("/")) {
                String arg = promptInt("Введите второе комплексное число: ");
                calculator.division(arg);
                String result = calculator.getResult();
                logging.recLogging(primaryArg, cmd, arg, result);
            }
            String result = calculator.getResult();
            System.out.println("Результат: " + result);

            System.out.println("Нажмите \"1\", чтобы воспользоваться калькулятором ещё раз: ");
            Scanner in = new Scanner(System.in);
            Integer num = in.nextInt();
            if (!num.equals(1)) {
                logging.interfaceLogging();
                flag = false;
            }
        }
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private String promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
