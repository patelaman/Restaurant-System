package com.company.ObjectsAggregators;


public class MenuItem {

    private int itemNumber;
    private String entree;
    private double price;

    public MenuItem(int itemNumber, String entree, double price) {
        this.itemNumber = itemNumber;
        this.entree = entree;
        this.price = price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        return String.format("$%.2f", price);
    }

    @Override
    public String toString() {
        return String.format("%-4s %14s %8s", itemNumber, entree, getFormattedPrice());
    }
}
