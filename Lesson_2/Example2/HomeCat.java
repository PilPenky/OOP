package Lesson_2.Example2;

public class HomeCat extends Cat{
    protected static int count;


    public HomeCat(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}