package com.company.Builder;

public class Builder {

    private CompleteMealBuilder completeMealBuilder;

    public Builder(CompleteMealBuilder mealBuilder) {
        this.completeMealBuilder = mealBuilder;
    }

    public void buildMeal() {
        completeMealBuilder.buildItemNumber();
        completeMealBuilder.buildAppetizer();
        completeMealBuilder.buildEntree();
        completeMealBuilder.buildDessert();
        completeMealBuilder.buildPrice();
        completeMealBuilder.buildDiscount();
    }
}
