package Lesson_2.Example2;

public class Tiger extends Cat{
    protected static int count;


    public Tiger(String name, String type, int maxRunDistance, int maxSwimDistance) {
        super(name, type, maxRunDistance, maxSwimDistance);
        count++;
    }
}
