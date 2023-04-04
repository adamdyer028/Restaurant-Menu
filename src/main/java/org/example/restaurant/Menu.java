package org.example.restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdated =  new Date();
    }
}
