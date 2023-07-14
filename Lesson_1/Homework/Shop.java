package Lesson_1.Homework;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;

    public Shop() {
        this.categories = new ArrayList<>();
    }
    public void addCategory(Category category) {
        categories.add(category);
    }
    public void printCatalog(){
        for (Category item_c : categories) {
            System.out.println(item_c.getName() + ":");
            ArrayList<Product> products = item_c.getProducts();
            for (Product item_p : products) {
                System.out.println("    - название: '" + item_p.getName() + "', цена: " + item_p.getPrice() + "₽, рейтинг: " + item_p.getRating() + "★");
            }

        }
    }
}
