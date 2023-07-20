package Lesson_5.Homework.Model;

import Lesson_5.Homework.Service.Birth;
import Lesson_5.Homework.Service.FormatContact;

public abstract class Contact {
    String contactName;
    Integer contactPhoneNumber;
    String contactEmail;
    Birth birth;
    FormatContact format;
    public Contact(String contactName, Integer contactPhoneNumber, String contactEmail, Birth birth, FormatContact format) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.contactEmail = contactEmail;
        this.birth = birth;
        this.format = format;
    }
    public String getContactName() {
        return contactName;
    }
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public Integer getContactPhoneNumber() {
        return contactPhoneNumber;
    }
    public void setContactPhoneNumber(Integer contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public Birth getBirth() {
        return birth;
    }
    public void setBirth(Birth birth) {
        this.birth = birth;
    }
    public FormatContact getFormat() {
        return format;
    }
    public void setFormat(FormatContact format) {
        this.format = format;
    }
}