package Lesson_5.Homework.View;

import Lesson_5.Homework.Controller.Controller;
import Lesson_5.Homework.Service.Birth;
import Lesson_5.Homework.Service.FormatContact;
import Lesson_5.Homework.Service.UserActions;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        UserActions userActions = new UserActions();

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
                List dataContact = userActions.addNewContact();
                String name = (String) dataContact.get(0);
                Integer phoneNumber = (Integer) dataContact.get(1);
                String email = (String) dataContact.get(2);
                Birth birth = (Birth) dataContact.get(3);
                FormatContact formatContact = (FormatContact) dataContact.get(4);


                controller.addContact(name, phoneNumber, email, birth, formatContact);
            }
            if (num.equals(3)) {
                controller.removeContact(userActions.removeContact());
            }
            if(num.equals(4)){
                controller.exportContact(userActions.exportContact());
            }
            if (num.equals(0)) {
                return;
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
        System.out.println("До свидания!");
    }
}