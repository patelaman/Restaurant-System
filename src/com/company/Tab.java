package com.company;

public class Tab {

    private Orders orders;
    private Menu menu;
    private CompleteMeals completeMeals;
    private String[] tab;

    public Tab(Orders orders, Menu menu, CompleteMeals completeMeals) {
        this.orders = orders;
        this.menu = menu;
        this.completeMeals = completeMeals;
        tab = new String[orders.getOrderItems().size() + completeMeals.getCompleteMeals().size()];
    }

    public String[] getTab() {
        int count = 0;
        for(OrderItem o: orders.getOrderItems()) {
            tab[count] = menu.getMenuItem(o.getItemNumber()).toString();
            count++;
        }
        for(CompleteMealBuilder completeMealBuilder: completeMeals.getCompleteMeals()) {
            tab[count] = menu.getMenuItem(completeMealBuilder.getMeal().getItemNumber()).toString();
            count++;
        }
        return tab;
    }

    public double getTabTotal() {
        double total = 0;
        for(OrderItem o: orders.getOrderItems()) {
            total += menu.getMenuItem(o.getItemNumber()).getPrice();
        }

        return total;
    }
}
