package Lesson_5.Example3;

public class Main {
    public static void main(String[] args) {

        Flyable flyable = new Flyable() {  // Анонимный класс
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        flyable.fly();

        System.out.println(flyable.getClass().getName());   // Вывод: Lesson_5.Example3.Main$1  - Папка, класс, ссылка, порядковый номер 1

        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("летим - летим!");
            }
        };
        System.out.println(flyable2.getClass().getName());  // Вывод: Lesson_5.Example3.Main$2  - Папка, класс, ссылка, порядковый номер 2


        /*
         Логика инициализирования классов:
             new Flyable()
             Outer implements Flyable
             происходит овверайд (переопределение) методов
             Outer fluyable = new Outer();
         */



    }
}
