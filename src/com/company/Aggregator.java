package com.company;

public class Aggregator {

    private Menu menu = new Menu();
    private Orders orders = new Orders();
    private CompleteMeals completeMeals = new CompleteMeals();

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    public CompleteMeals getCompleteMeals() {
        return completeMeals;
    }
}
