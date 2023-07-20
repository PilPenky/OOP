package Lesson_5.Example4_Task.Service;

import Lesson_5.Example4_Task.Model.Type;
import Lesson_5.Example4_Task.Model.User;
import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();

    List<User> readOnlyStudent();
}
