package Lesson_5.Example4_Task.View;

import Lesson_5.Example4_Task.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStuden("qwe", "asd", "zxc");
        controller.createStuden("qwe", "asd", "zxc");
        controller.createStuden("qwe", "asd", "zxc");
        controller.getAllStudent();

    }
}
