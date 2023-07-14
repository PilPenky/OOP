package Lesson_2.Homework_final;

public class A_Robot extends Participants implements Action{

    public A_Robot(String name, int maxRunDistance, double maxJumpLength) {
        super(name, maxRunDistance, maxJumpLength);
    }

    public void run() {
        System.out.println("Робот бежит");
    }
    public void jump() {
        System.out.println("Робот прыгает");
    }
    public void stand() {
        System.out.println("Робот стоит на месте");
    }


//    public A_Robot(String name, int maxRunDistance, double maxJumpLength) {
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