package com.company;

public class Builder {

    private CompleteMealBuilder completeMealBuilder;

    public Builder(CompleteMealBuilder mealBuilder) {
        this.completeMealBuilder = mealBuilder;
    }


    public CompleteMeal getCompleteMeal() { return this.completeMealBuilder.getMeal(); }


    public void buildMeal() {
        completeMealBuilder.buildItemNumber();
        completeMealBuilder.buildAppetizer();
        completeMealBuilder.buildEntree();
        completeMealBuilder.buildDessert();
        completeMealBuilder.buildPrice();
    }
}
