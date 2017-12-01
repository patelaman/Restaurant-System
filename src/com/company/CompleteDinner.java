package com.company;

public class CompleteDinner implements CompleteMeal {

    private String appetizer;
    private String entree;
    private String dessert;
    private double price;

    @Override
    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public String getAppetizer() { return appetizer; }

    @Override
    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getEntree() { return entree; }

    @Override
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getDessert() { return dessert; }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }
}
