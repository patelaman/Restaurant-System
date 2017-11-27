package com.company;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menu;

    public Menu() {
        this.menu = new ArrayList();
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
