package Lesson_3.Homework;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        char ch;
        for (int i = 97; i <= 122; i++) {
            ch = (char) i;
            result.add(String.valueOf(ch));
        }

        return result;
    }
}
