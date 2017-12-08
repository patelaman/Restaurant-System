package com.company.Builder;

import com.company.ObjectsAggregators.OrderItem;

public interface CompleteMeal {

    public void setItemNumber(int itemNumber);

    public int getItemNumber();

    public void setAppetizer(int appetizer);

    public OrderItem getAppetizer();

    public void setEntree(int entree);

    public OrderItem getEntree();

    public void setDessert(int dessert);

    public OrderItem getDessert();

    public void setPrice(double price);

    public double getPrice();

    public void setDiscount(double discount);

    public double getDiscount();
}
