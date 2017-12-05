package com.company;

public class CompleteDinnerMeal_2 implements CompleteMealBuilder{

    private CompleteDinner completeDinner;
    private Menu menu = new Menu();


    public CompleteDinnerMeal_2() {
        this.completeDinner = new CompleteDinner();
    }

    @Override
    public void buildItemNumber() {
        completeDinner.setItemNumber(11);
    }

    @Override
    public void buildAppetizer() {
        completeDinner.setAppetizer(2);
    }

    @Override
    public void buildEntree() {
        completeDinner.setEntree(5);
    }

    @Override
    public void buildDessert() {
        completeDinner.setDessert(8);
    }

    @Override
    public void buildPrice() {
        completeDinner.setPrice(33.00);
    }

    @Override
    public CompleteMeal getMeal() {
        return this.completeDinner;
    }

    @Override
    public String toString(){
        return "11 - Dinner Meal: \n\t" + menu.getMenuItem(2).toString() + "\n\t"
                + menu.getMenuItem(5).toString() + "\n\t" + menu.getMenuItem(8).toString()
                + "\n\tSale Price: \t" + "$33.00";
    }
}