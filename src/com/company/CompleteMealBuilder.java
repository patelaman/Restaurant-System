package com.company;

public interface CompleteMealBuilder {

    public void buildItemNumber();

    public void buildAppetizer();

    public void buildEntree();

    public void buildDessert();

    public void buildPrice();

    public void buildDiscount();

    public CompleteMeal getMeal();

    public String toString();
}
