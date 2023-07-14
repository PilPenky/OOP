package Lesson_2.Example3;

public class Bysicle implements Transport {
    @Override
    public void start() {
        System.out.println("Велосипед поехал");
    }

    public void stop() {
        System.out.println("Велосипед остановился");
    }

}
