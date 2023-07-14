package Lesson_3.Homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateL {
    public String Date(){
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy(HH:mm:ss)");
        return formatForDateNow.format(date);
    }
}
