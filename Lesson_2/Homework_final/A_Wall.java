package Lesson_2.Homework_final;

public class A_Wall extends Obstacles{
    public double height;
    public String name;
    public double maxJumpLength;
    public static int getHeightBool;
    public A_Wall(double height, String name, double maxJumpLength) {
        this.height = height;
        this.name = name;
        this.maxJumpLength = maxJumpLength;
    }

    public void getHeight() {
        if (height <= maxJumpLength) {
            System.out.println(name + " - перепрыгнул стену :)");
        }
        else {
            System.out.println(name + " - не перепрыгнул стену :(");
        }
    }
    public double getHeightBool() {
        if (height <= maxJumpLength) {
            return getHeightBool = 1;
        }
        else {
            return getHeightBool = 0;
        }
    }
}