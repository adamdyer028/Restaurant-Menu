package org.example.restaurant;

public class MenuItem {
    private String name;
    private double price;
    private String type;
    private boolean isNew;

    public MenuItem(String name) {
        this.name = name;
        this.price = 0;
        this.type = "Unknown";
    }
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.type = "Unknown";
    }
    public MenuItem(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public MenuItem(String name, double price, String type, boolean isNew) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.isNew = isNew;
    }
    public MenuItem() {
        this.name = "Unknown";
        this.price = 0;
        this.type = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
