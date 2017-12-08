package com.company.Builder;

public interface CompleteMealBuilder {

    void buildItemNumber();

    void buildAppetizer();

    void buildEntree();

    void buildDessert();

    void buildPrice();

    void buildDiscount();

    CompleteMeal getMeal();

    String toString();
}
