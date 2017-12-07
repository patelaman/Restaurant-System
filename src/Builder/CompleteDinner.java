package Builder;

import ObjectsAggregators.OrderItem;

public class CompleteDinner implements CompleteMeal {

    private int itemNumber;
    private int appetizer;
    private int entree;
    private int dessert;
    private double price;
    private double discount;

    @Override
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    @Override
    public int getItemNumber() {
        return itemNumber;
    }

    @Override
    public void setAppetizer(int appetizer) {
        this.appetizer = appetizer;
    }

    @Override
    public OrderItem getAppetizer() {
        return new OrderItem(appetizer);
    }

    @Override
    public void setEntree(int entree) {
        this.entree = entree;
    }

    @Override
    public OrderItem getEntree() {
        return new OrderItem(entree);
    }

    @Override
    public void setDessert(int dessert) {
        this.dessert = dessert;
    }

    @Override
    public OrderItem getDessert() {
        return new OrderItem(dessert);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() { return price; }

    public String getFormattedPrice() {
        return String.format("$%.2f", price);
    }

    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return discount;
    }
}
