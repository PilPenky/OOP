package Lesson_5.Homework.View;

import Lesson_5.Homework.Controller.Controller;
import Lesson_5.Homework.Service.Birth;
import Lesson_5.Homework.Service.FormatContact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.addContact("Артур", 900100222, "atr@mail.ru", new Birth(2023, 07, 18), FormatContact.DB);
        controller.addContact("Олик", 980777555, "kot-olik@mail.ru", new Birth(2020, 06, 27), FormatContact.DB);
        controller.addContact("Кролик", 980777555, "krol-ik@mail.ru", new Birth(2020, 06, 27), FormatContact.DB);
        controller.addContact("Зайка", 980777555, "za-ika@mail.ru", new Birth(2020, 06, 27), FormatContact.VCF);
        controller.addContact("Лиса", 980777555, "li-sa@mail.ru", new Birth(2020, 06, 27), FormatContact.VCF);

        System.out.println("Телефонный справочник:\n" +
                        "       1 - Показать все контакты;\n" +
                        "       2 - Добавить новый контакт;\n" +
                        "       3 - Удалить контакт;\n" +
                        "       4 - Выгрузка контактов;\n" +
                        "       0 - Закрыть программу.\n" +
                "<<Укажите номер команды: >>");

        Scanner scannerNum = new Scanner(System.in);
        Integer num = scannerNum.nextInt();

        while (!num.equals(0)) {
            if (num.equals(1)) {
                controller.getAllContacts();
            }
            if (num.equals(2)) {
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

                controller.addContact(name, phoneNumber, email, new Birth(yearBirth, monthBirth, dayBirth), formatContact);
            }
            if (num.equals(3)) {
                System.out.println("Укажите Id контакта, который хотите удалить: ");
                Integer numRemove = scannerNum.nextInt();
                controller.removeContact(numRemove);
            }
            if(num.equals(4)){
                System.out.println("Укажите формат контактов, которые хотите выгрузить:\n" +
                        "1 - .vcf-формат;\n" +
                        "2 - .db-формат;\n" +
                        "3 - Все форматы.");
                Integer numFormat = scannerNum.nextInt();
                if(numFormat.equals(1)){
                    controller.exportContact(FormatContact.VCF);
                }
                else if(numFormat.equals(2)){
                    controller.exportContact(FormatContact.DB);
                }
                else if(numFormat.equals(3)){
                    controller.exportContact(FormatContact.ALLFORMAT);
                }
            }

            if (num.equals(0)) {
                System.out.println("До свидания!");
            }

            System.out.println();
            System.out.println(
                    "       1 - Показать все контакты;\n" +
                    "       2 - Добавить новый контакт;\n" +
                    "       3 - Удалить контакт;\n" +
                    "       4 - Выгрузка контактов;\n" +
                    "       0 - Закрыть программу.\n" +
                    "<<Укажите номер команды: >>");
            num = scannerNum.nextInt();
        }
    }
}