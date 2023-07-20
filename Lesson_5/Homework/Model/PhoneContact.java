package Lesson_5.Homework.Model;

import Lesson_5.Homework.Service.Birth;
import Lesson_5.Homework.Service.FormatContact;

public class PhoneContact extends Contact{
    Integer contactId;

    public PhoneContact(Integer contactId, String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        super(contactName, contactPhoneNumber, contactEmail, birth, format);
        this.contactId = contactId;
    }

    public PhoneContact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        super(contactName, contactPhoneNumber, contactEmail, birth, format);
    }

    public Integer getContactId() {
        return contactId;
    }
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    @Override
    public String toString() {
        return  contactId + ". " +
                "Имя: " + contactName + ", " +
                "Номер телефона: " + contactPhoneNumber + ", " +
                "Электронная почта: " + contactEmail + ", " +
                "Дата рождения: " + birth + ", " +
                "Формат: ." + format + ";";
    }
}

