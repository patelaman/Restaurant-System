package com.company.Builder;

import com.company.ObjectsAggregators.Menu;

public class CompleteDinnerMeal_1 implements CompleteMealBuilder{

    private CompleteDinner completeDinner;
    private Menu menu = new Menu();


    public CompleteDinnerMeal_1() {
        this.completeDinner = new CompleteDinner();
    }

    @Override
    public void buildItemNumber() {
        completeDinner.setItemNumber(10);
    }

    @Override
    public void buildAppetizer() {
        completeDinner.setAppetizer(1);
    }

    @Override
    public void buildEntree() {
        completeDinner.setEntree(4);
    }

    @Override
    public void buildDessert() {
        completeDinner.setDessert(7);
    }

    @Override
    public void buildPrice() {
        completeDinner.setPrice(20.00);
    }

    @Override
    public void buildDiscount() {
        completeDinner.setDiscount(3.50);
    }

    @Override
    public CompleteMeal getMeal() {
        return this.completeDinner;
    }

    @Override
    public String toString(){
        buildPrice();
        return String.format("10 - Dinner Meal\n%s\n%s\n%s\nSale Price:%17s",
                menu.getMenuItem(1),
                menu.getMenuItem(4),
                menu.getMenuItem(7),
                completeDinner.getFormattedPrice());
    }

}
