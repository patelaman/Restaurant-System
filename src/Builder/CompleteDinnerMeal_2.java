package Builder;

import ObjectsAggregators.Menu;

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
    public void buildDiscount() {
        completeDinner.setDiscount(6.00);
    }

    @Override
    public CompleteMeal getMeal() {
        return this.completeDinner;
    }

    @Override
    public String toString(){
        buildPrice();
        return String.format("10 - Dinner Meal\n%s\n%s\n%s\nSale Price:%17s",
                menu.getMenuItem(2),
                menu.getMenuItem(5),
                menu.getMenuItem(8),
                completeDinner.getFormattedPrice());

    }
}