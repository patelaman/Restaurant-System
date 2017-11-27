package com.company;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu;

    public Menu() {
        this.menu = new ArrayList();
        menu.add(new MenuItem(1,"Chicken", 12.00));
        menu.add(new MenuItem(2,"Steak", 25.00));
        menu.add(new MenuItem(3,"Salmon", 14.00));
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
