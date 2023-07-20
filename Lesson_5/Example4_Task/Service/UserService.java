package Lesson_5.Example4_Task.Service;

import Lesson_5.Example4_Task.Model.Student;
import Lesson_5.Example4_Task.Model.Teacher;
import Lesson_5.Example4_Task.Model.Type;
import Lesson_5.Example4_Task.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, patron, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, patron, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readOnlyStudent() {
        List<User> students = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student){
                students.add(user);
            }
        }
        return students;
    }
}