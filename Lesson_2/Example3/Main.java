package Lesson_2.Example3;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Bysicle bysicle = new Bysicle();
        Motocycle motocycle = new Motocycle();
        human.stop();
        human.drive(bysicle);
        human.stop();
        human.drive(motocycle);
    }
}
