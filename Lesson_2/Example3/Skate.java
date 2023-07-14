package Lesson_2.Example3;

public class Skate implements Transport {
    @Override
    public void start() {
        System.out.println(" skate run");
    }

    public void stop() {
        System.out.println("скейт остановился");
    }
}