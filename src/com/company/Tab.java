package com.company;

public class Tab {

    private Orders orders;
    private Menu menu;
    private String[] tab = new String[orders.getOrderItems().size()];

    public Tab(Orders orders, Menu menu) {
        this.orders = orders;
        this.menu = menu;
    }

    public String[] getTab() {
        int count = 0;
        //int price = 0;
        for(OrderItem o: orders.getOrderItems()) {
            tab[count] = menu.getMenuItem(o.getItemNumber()).toString();
            //price += menu.getMenuItem(o.getItemNumber()).getPrice();
            count++;
        }
        return tab;
    }
}
