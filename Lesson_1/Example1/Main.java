package Lesson_1.Example1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", "orange", -3);
//        Cat cat2 = new Cat("barsik2", "orange2", 11);
        cat1.setAge(-5);
        cat1.setAge(10);
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
    }
}