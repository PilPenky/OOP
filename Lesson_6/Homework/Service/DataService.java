package Lesson_6.Homework.Service;

import Lesson_6.Homework.Model.Contact;
import java.util.List;

public interface DataService {
    List<Contact> getAllContacts();
    void addContact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format);
    void removeContact(int num);
    List<Contact> export(FormatContact formatContact);
    List<Contact> changeFormat();
}
