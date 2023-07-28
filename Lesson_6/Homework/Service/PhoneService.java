package Lesson_6.Homework.Service;

import Lesson_6.Homework.Model.Contact;
import Lesson_6.Homework.Model.PhoneContact;

import java.util.ArrayList;
import java.util.List;

public class PhoneService implements DataService{
    private List<Contact> phoneList = new ArrayList<>();

    @Override
    public List<Contact> getAllContacts() {
        return phoneList;
    }

    @Override
    public void addContact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        int id = getId();
        PhoneContact phoneContact = new PhoneContact(id, contactName, contactPhoneNumber, contactEmail, birth, format);
        phoneList.add(phoneContact);
    }

    @Override
    public void removeContact(int num) {
        phoneList.remove(num-1);
    }

    @Override
    public List<Contact> export(FormatContact formatContact) {
        if(formatContact.equals(FormatContact.ALLFORMAT)){
            return phoneList;
        }

        List<Contact> formatList = new ArrayList<>();
        for (Contact contact : phoneList) {
            if(formatContact.equals(contact.getFormat())){
                formatList.add(contact);
            }
        }
        return formatList;
    }

    @Override
    public List<Contact> changeFormat() {
        return phoneList;
    }

    private int getId() {
        int lastId = 1;
        for (Contact contact : phoneList) {
            lastId++;
        }
        return lastId;
    }
}