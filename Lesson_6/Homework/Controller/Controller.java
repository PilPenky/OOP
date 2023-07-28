package Lesson_6.Homework.Controller;


import Lesson_6.Homework.Service.*;
import Lesson_6.Homework.Model.Contact;
import Lesson_6.Homework.Model.PhoneContact;
import Lesson_6.Homework.View.ContactView;

import java.util.List;

public class Controller {
    private final PhoneService service = new PhoneService();
    private final ContactView contactView = new ContactView();

    public List<Contact> getAllContacts() {
        List<Contact> contacts = service.getAllContacts();
        for (Contact contact : contacts) {
            PhoneContact phoneContact = (PhoneContact) contact;
            contactView.printConsole(phoneContact);
        }
        return contacts;
    }

    public void addContact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        service.addContact(contactName, contactPhoneNumber, contactEmail, birth, format);
    }

    public void removeContact(int num) {
        service.removeContact(num);
    }

    public void exportContact(FormatContact formatContact) {
        List<Contact> contacts = service.export(formatContact);
        for (Contact contact : contacts) {
            PhoneContact phoneContact = (PhoneContact) contact;
            contactView.printConsole(phoneContact);
        }
    }

    public void changeFormat(FormatContact formatContact) {
        List<Contact> contacts = service.changeFormat();
        if (formatContact.equals(FormatContact.VCF)) {
            Formatter formatter = new VсfFormatter();
            Controller controller = new Controller();
            formatter.formatted(contacts);
        }
        else if (formatContact.equals(FormatContact.DB)) {
            Formatter formatter = new DbFormatter();
            Controller controller = new Controller();
            formatter.formatted(contacts);
        }
    }
}















