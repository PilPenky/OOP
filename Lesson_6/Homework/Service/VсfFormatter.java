package Lesson_6.Homework.Service;

import Lesson_6.Homework.Model.Contact;
import java.util.List;

public class VсfFormatter implements Formatter{
    @Override
    public void formatted(List<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact + " - контакт переведен в формат: " + FormatContact.VCF);
        }
    }
}
