package Lesson_5.Example4_Task.Model;

public class Teacher extends User {
    int techerId;

    public Teacher(String name, String surname, String patron, int techerId) {
        super(name, surname, patron);
        this.techerId = techerId;
    }

    public int getTecherId() {
        return techerId;
    }

    public void setTecherId(int techerId) {
        this.techerId = techerId;
    }
}