package Lesson_5.Homework.Controller;

import Lesson_5.Homework.Service.Birth;
import Lesson_5.Homework.Model.Contact;
import Lesson_5.Homework.Model.PhoneContact;
import Lesson_5.Homework.Service.FormatContact;
import Lesson_5.Homework.Service.PhoneService;
import Lesson_5.Homework.View.ContactView;

import java.util.List;

public class Controller {
    private final PhoneService service = new PhoneService();
    private final ContactView contactView = new ContactView();

    public void getAllContacts() {
        List<Contact> contacts = service.getAllContacts();
        for (Contact contact : contacts) {
            PhoneContact phoneContact = (PhoneContact) contact;
            contactView.printConsole(phoneContact);
        }
    }
    public void addContact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        service.addContact(contactName, contactPhoneNumber, contactEmail, birth, format);
    }
    public void removeContact(int num){
        service.removeContact(num);
    }

    public void exportContact(FormatContact formatContact) {
        List<Contact> contacts = service.export(formatContact);
        for (Contact contact : contacts) {
            PhoneContact phoneContact = (PhoneContact) contact;
            contactView.printConsole(phoneContact);
        }
    }
}