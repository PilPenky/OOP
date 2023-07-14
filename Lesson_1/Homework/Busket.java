package Lesson_1.Homework;

import java.util.ArrayList;

public class Busket {
    private ArrayList<Product> products;

    public Busket() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }
}
