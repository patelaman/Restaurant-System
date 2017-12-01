package com.company;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu;

    public Menu() {
        this.menu = new ArrayList();
        menu.add(new MenuItem(1,"Nachos", 4.00));
        menu.add(new MenuItem(2,"Loaded Fries", 6.00));
        menu.add(new MenuItem(3,"Avocado Toast", 8.00));
        menu.add(new MenuItem(4,"Chicken", 12.00));
        menu.add(new MenuItem(5,"Steak", 25.00));
        menu.add(new MenuItem(6,"Salmon", 14.00));
        menu.add(new MenuItem(7,"Ice Cream", 7.50));
        menu.add(new MenuItem(8,"Chocolate Cake", 8.00));
        menu.add(new MenuItem(9,"Cheesecake", 10.00));
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public MenuItem getMenuItem(int itemNumber) {
        for(MenuItem menuItem: menu) {
            if(menuItem.getItemNumber() == itemNumber)
                return menuItem;
        }

        return null;
    }
}
