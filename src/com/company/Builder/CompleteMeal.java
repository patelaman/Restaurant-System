package com.company.Builder;

import com.company.ObjectsAggregators.OrderItem;

public interface CompleteMeal {

    void setItemNumber(int itemNumber);

    int getItemNumber();

    void setAppetizer(int appetizer);

    OrderItem getAppetizer();

    void setEntree(int entree);

    OrderItem getEntree();

    void setDessert(int dessert);

    OrderItem getDessert();

    void setPrice(double price);

    double getPrice();

    void setDiscount(double discount);

    double getDiscount();
}
