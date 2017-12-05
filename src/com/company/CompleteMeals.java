package com.company;

import java.util.ArrayList;

public class CompleteMeals {

    private ArrayList<CompleteMealBuilder> completeMeals;

    public CompleteMeals() {
        this.completeMeals = new ArrayList();
        completeMeals.add(new CompleteDinnerMeal_1());
        completeMeals.add(new CompleteDinnerMeal_2());
    }

    public void buildMeals() {
        Builder builder;
        for(CompleteMealBuilder completeMealBuilder: completeMeals) {
            builder = new Builder(completeMealBuilder);
            builder.buildMeal();
        }
    }

    public ArrayList<CompleteMealBuilder> getCompleteMeals() {
        return completeMeals;
    }
}
