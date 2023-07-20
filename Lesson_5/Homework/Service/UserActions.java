package Lesson_5.Homework.Service;

import Lesson_5.Homework.Controller.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserActions {
    public List addNewContact() {
        List contact = new ArrayList();

        Controller controller = new Controller();
        Scanner scannerNum = new Scanner(System.in);

        System.out.println("Укажите имя контакта: ");
        String name = scannerNum.next();

        System.out.println("Укажите номер телефона контакта: ");
        Integer phoneNumber = scannerNum.nextInt();

        System.out.println("Укажите электронную почту контакта: ");
        String email = scannerNum.next();

        System.out.println("Укажите год рождения контакта: ");
        Integer yearBirth = scannerNum.nextInt();

        System.out.println("Укажите месяц рождения контакта: ");
        Integer monthBirth = scannerNum.nextInt();

        System.out.println("Укажите день рождения контакта: ");
        Integer dayBirth = scannerNum.nextInt();

        System.out.println("Укажите формат контакта:\n" +
                "1 - .vcf-формат;\n" +
                "2 - .db-формат.");

        Integer numFormat = scannerNum.nextInt();
        FormatContact formatContact = null;
        if(numFormat.equals(1)){
            formatContact = FormatContact.VCF;
        }
        else if(numFormat.equals(2)){
            formatContact = FormatContact.DB;
        }
        contact.add(name);
        contact.add(phoneNumber);
        contact.add(email);
        contact.add(new Birth(yearBirth, monthBirth, dayBirth));
        contact.add(formatContact);

        return contact;
    }
    public Integer removeContact() {
        Scanner scannerNum = new Scanner(System.in);
        System.out.println("Укажите Id контакта, который хотите удалить: ");
        Integer numRemove = scannerNum.nextInt();
        return numRemove;
    }
    public FormatContact exportContact() {
        Scanner scannerNum = new Scanner(System.in);

        System.out.println("Укажите формат контактов, которые хотите выгрузить:\n" +
                "1 - .vcf-формат;\n" +
                "2 - .db-формат;\n" +
                "3 - Все форматы.");
        Integer numFormat = scannerNum.nextInt();
        if(numFormat.equals(1)){
            return FormatContact.VCF;
        }
        else if(numFormat.equals(2)){
            return FormatContact.DB;
        }
        else if(numFormat.equals(3)){
            return FormatContact.ALLFORMAT;
        }
        return FormatContact.ALLFORMAT;
    }
}