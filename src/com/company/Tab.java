package com.company;

public class Tab {

    private Orders orders;
    private Menu menu;
    private String[] tab;

    public Tab(Orders orders, Menu menu) {
        this.orders = orders;
        this.menu = menu;
        tab = new String[orders.getOrderItems().size()];
    }

    public String[] getTab() {
        int count = 0;
        for(OrderItem o: orders.getOrderItems()) {
            tab[count] = menu.getMenuItem(o.getItemNumber()).toString();
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
