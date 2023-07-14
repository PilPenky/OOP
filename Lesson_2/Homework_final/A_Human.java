package Lesson_2.Homework_final;

public class A_Human extends Participants implements Action{
    public A_Human(String name, int maxRunDistance, double maxJumpLength) {
        super(name, maxRunDistance, maxJumpLength);
    }

    public void run() {
        System.out.println("Человек бежит");
    }
    public void jump() {
        System.out.println("Человек прыгает");
    }
    public void stand() {
        System.out.println("Человек стоит на месте");
    }

//    public String name;
//    public int maxRunDistance;
//    public double maxJumpLength;
//
//    public A_Human(String name, int maxRunDistance, double maxJumpLength) {
//        this.name = name;
//        this.maxRunDistance = maxRunDistance;
//        this.maxJumpLength = maxJumpLength;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getMaxRunDistance() {
//        return maxRunDistance;
//    }
//
//    public double getMaxJumpLength() {
//        return maxJumpLength;
//    }
//
//    public void run() {
//        System.out.println(name + " бежит");
//    }
//
//    public void jump() {
//        System.out.println(name + " прыгает");
//    }
}