package com.company;

public class Aggregator {

    private Menu menu = new Menu();
    private Orders orders = new Orders();

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }
}
