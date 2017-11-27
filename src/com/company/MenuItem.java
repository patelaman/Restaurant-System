package com.company;


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

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return itemNumber + "\t" + entree + "\t" + price;
    }
}
