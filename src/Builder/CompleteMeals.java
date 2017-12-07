package Builder;

import java.util.ArrayList;

public class CompleteMeals {

    private ArrayList<CompleteMealBuilder> completeMealsMenu;
    private ArrayList<CompleteMealBuilder> completeMeals;

    public CompleteMeals() {
        this.completeMeals = new ArrayList();
        this.completeMealsMenu = new ArrayList();
        completeMealsMenu.add(new CompleteDinnerMeal_1());
        completeMealsMenu.add(new CompleteDinnerMeal_2());
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

    public ArrayList<CompleteMealBuilder> getCompleteMealsMenu() {
        return completeMealsMenu;
    }
}
