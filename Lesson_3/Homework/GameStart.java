package Lesson_3.Homework;

import java.util.Scanner;

public class GameStart {

    public void GameSS(Integer num) {
        Logging logging = new Logging();
        if (num.equals(1)) {
            System.out.println("Введите количество символов, которые будете угадывать, а также количество попыток:");
            NumberGame numberGame = new NumberGame();
            Scanner scanner = new Scanner(System.in);
            numberGame.start(scanner.nextInt(), scanner.nextInt());
            System.out.println("Введите вариант ответа: ");
            scanner.nextLine();
            while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = numberGame.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                    logging.recLogging(value);
                }
            }
            logging.InterfaceLogging();

        } else if (num.equals(2)) {
            System.out.println("Введите количество символов, которые будете угадывать, а также количество попыток:");
            RuGame ruGame = new RuGame();
            Scanner scanner = new Scanner(System.in);
            ruGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!ruGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = ruGame.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                    logging.recLogging(value);
                }
            }
            logging.InterfaceLogging();

        } else if (num.equals(3)) {
            System.out.println("Введите количество символов, которые будете угадывать, а также количество попыток:");
            EngGame engGame = new EngGame();
            Scanner scanner = new Scanner(System.in);
            engGame.start(scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            while (!engGame.getGameStatus().equals(GameStatus.FINISH)) {
                String value = scanner.nextLine();
                Answer answer = engGame.inputValue(value);
                if (answer != null) {
                    System.out.println(answer);
                    logging.recLogging(value);
                }
            }
            logging.InterfaceLogging();
        }
    }

}
