package Lesson_5.Example4_Task.Controller;

import Lesson_5.Example4_Task.Model.Student;
import Lesson_5.Example4_Task.Model.Type;
import Lesson_5.Example4_Task.Model.User;
import Lesson_5.Example4_Task.Service.UserService;
import Lesson_5.Example4_Task.View.StudentView;

import java.util.List;

public class Controller {
    private final UserService service = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStuden(String name, String surname, String patron) {
        service.create(name, surname, patron, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> studentList = service.readOnlyStudent();
        for (User user : studentList) {
            Student student = (Student) user;
            studentView.printConsole(student);
        }
    }
}