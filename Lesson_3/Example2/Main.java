package Lesson_3.Example2;

public class Main {
    public static void main(String[] args) {
        Fruits fruit = Fruits.ORANGE;

        switch (fruit) {
            case APPLE -> System.out.println("Яблоко");
            case ORANGE -> System.out.println("Апельсин");
            case PEACH -> System.out.println("Персик");
            default -> System.out.println("Фрукт не найден");
        }

        System.out.println(fruit.getNumber());
    }
}
