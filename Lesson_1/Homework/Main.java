package Lesson_1.Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Category category1 = new Category("Верхняя одежда");
        category1.addProduct(new Product("Ветровка", 2_179, 4.6));
        category1.addProduct(new Product("Пальто", 9_919.99, 4.8));
        category1.addProduct(new Product("Пуховик", 5_500, 3.9));

        Category category2 = new Category("Головные уборы");
        category2.addProduct(new Product("Бейсболка", 350, 5));
        category2.addProduct(new Product("Шапка", 430, 4.2));
        category2.addProduct(new Product("Шляпа", 1_955, 4.2));

        shop.addCategory(category1);
        shop.addCategory(category2);

        User user1 = new User("Ваня", "ivan007");
        User user2 = new User("Коля", "coca-kolya");

        user1.getBusket().addProduct(category1.getProducts().get(2));
        user2.getBusket().addProduct(category2.getProducts().get(1));

        category1.getProducts().remove(0);
        category2.getProducts().remove(1);

        System.out.println("        Товары в магазине:");
        shop.printCatalog();

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("Пользователь '" + user1.getLogin() + "', купил:");
        ArrayList<Product> user1Products = user1.getBusket().getProducts();
        for (Product item_p: user1Products) {
            System.out.println("    - название: '" + item_p.getName() + "', цена: " + item_p.getPrice() + "₽, рейтинг: " + item_p.getRating() + "★");
        }

        System.out.println("Пользователь '" + user2.getLogin() + "', купил:");
        ArrayList<Product> user2Products = user2.getBusket().getProducts();
        for (Product item_p: user2Products) {
            System.out.println("    - название: '" + item_p.getName() + "', цена: " + item_p.getPrice() + "₽, рейтинг: " + item_p.getRating() + "★");
        }

        System.out.println("\n---------------------------------------------------------------\n");

        System.out.println("        Товары в магазине(после покупки):");
        shop.printCatalog();
    }
}
