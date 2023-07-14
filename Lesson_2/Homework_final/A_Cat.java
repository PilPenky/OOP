package Lesson_2.Homework_final;

public class A_Cat extends Participants implements Action{

    public A_Cat(String name, int maxRunDistance, double maxJumpLength) {
        super(name, maxRunDistance, maxJumpLength);
    }

    public void run() {
        System.out.println("Котик тыгыдыкает (бежит)");
    }
    public void jump() {
        System.out.println("Котик тыгыдыкает в полёте (прыгает)");
    }
    public void stand() {
        System.out.println("Котик не тыгыдыкает (стоит на месте)");
    }
}