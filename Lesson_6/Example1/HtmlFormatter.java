package Lesson_6.Example1;

import java.util.List;

public class HtmlFormatter implements Formatter{
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " была переведенна в формат: " + Format.HTML);
        }
    }
}
