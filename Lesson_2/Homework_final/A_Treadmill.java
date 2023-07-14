package Lesson_2.Homework_final;

public class A_Treadmill extends Obstacles{
    public int length;
    public String name;
    public int maxRunDistance;
    public static int getLengthBool;
    public A_Treadmill(int length, String name, int maxRunDistance) {
        this.length = length;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
    }

    public void getLength() {
        if (length <= maxRunDistance) {
            System.out.println(name + " - расстояние пробежал :)");
        }
        else {
            System.out.println(name + " - расстояние не пробежал :(");
        }
    }

    public int getLengthBool() {
        if (length <= maxRunDistance) {
            return getLengthBool = 1;
        }
        else {
            return getLengthBool = 0;
        }
    }

}