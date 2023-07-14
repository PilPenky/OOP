package Lesson_3.Homework;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        char ch = 1105;
        result.add(String.valueOf(ch));
        for (int i = 1072; i <= 1103; i++) {
            ch = (char) i;
            result.add(String.valueOf(ch));
        }

        return result;
    }
}
