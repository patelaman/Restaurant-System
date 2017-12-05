package com.company;

public class CompleteDinner implements CompleteMeal {

    private int itemNumber;
    private int appetizer;
    private int entree;
    private int dessert;
    private double price;

    @Override
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public void setAppetizer(int appetizer) {
        this.appetizer = appetizer;
    }

    public int getAppetizer() { return appetizer; }

    @Override
    public void setEntree(int entree) {
        this.entree = entree;
    }

    public int getEntree() { return entree; }

    @Override
    public void setDessert(int dessert) {
        this.dessert = dessert;
    }

    public int getDessert() { return dessert; }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }
}
