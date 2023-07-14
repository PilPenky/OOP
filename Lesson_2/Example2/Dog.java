package Lesson_2.Example2;

public class Dog extends Animal {
    protected static int count;

    public Dog(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, "Пёс", maxRunDistance, maxSwimDistance);
        count++;
    }
}
