package com.company;

public class Tab {

    private Orders orders;
    private Menu menu;
    private CompleteMeals completeMeals;
    private String[] tab;
    private double discounts;
    private double total = 0;

    public Tab(Orders orders, Menu menu, CompleteMeals completeMeals) {
        this.orders = orders;
        this.menu = menu;
        this.completeMeals = completeMeals;
        tab = new String[orders.getOrderItems().size() + completeMeals.getCompleteMeals().size() * 3];
    }

    public String[] getTab() {
        completeMeals.buildMeals();
        for(CompleteMealBuilder completeMealBuilder: completeMeals.getCompleteMeals()) {
            orders.getOrderItems().add(completeMealBuilder.getMeal().getAppetizer());
            orders.getOrderItems().add(completeMealBuilder.getMeal().getEntree());
            orders.getOrderItems().add(completeMealBuilder.getMeal().getDessert());
        }

        int count = 0;
        for(OrderItem o: orders.getOrderItems()) {
            tab[count] = menu.getMenuItem(o.getItemNumber()).toString();
            count++;
        }
        return tab;
    }

    public double getDiscounts() {
        for(CompleteMealBuilder completeMealBuilder: completeMeals.getCompleteMeals()) {
            discounts += completeMealBuilder.getMeal().getDiscount();
        }
        return discounts;
    }

    public double getTabTotal() {
        for(OrderItem o: orders.getOrderItems()) {
            total += menu.getMenuItem(o.getItemNumber()).getPrice();
        }

        total -= getDiscounts();

        return total;
    }
}
