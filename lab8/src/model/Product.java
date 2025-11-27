package model;

public class Product {
    private int id;
    private double price;
    private String name;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public double getPrice() { return price; }

    ///other code...
}
