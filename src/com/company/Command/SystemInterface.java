package com.company.Command;

import com.company.ObjectsAggregators.Aggregator;
import com.company.Builder.CompleteMealBuilder;
import com.company.ObjectsAggregators.MenuItem;

public class SystemInterface {

    private static Invoker invoker;

    public void setInvoker() {
        invoker = new Invoker(new Aggregator());
    }

    public String[] displayMenu() {
        String[] menu = new String[invoker.displayMenu().getMenu().size()];
        int count = 0;
        for(MenuItem menuItem: invoker.displayMenu().getMenu()) {
            menu[count] = menuItem.toString();
            count++;
        }
        return menu;
    }

    public String[] displayMeals() {
        String[] meals = new String[invoker.displayMeals().getCompleteMealsMenu().size()];
        int count = 0;
        for(CompleteMealBuilder completeMealBuilder: invoker.displayMeals().getCompleteMealsMenu()) {
            meals[count] = completeMealBuilder.toString();
            count++;
        }
        return meals;
    }

    public int[] submitOrder(int itemNumber) {
        invoker.submitOrder(itemNumber);
        int[] order = {itemNumber};
        return order;
    }

    public String[] displayTab() {
        return invoker.displayTab().getTab();
    }

    public double displayTabTotal() {
        return invoker.displayTabTotal().getTabTotal();
    }

    public double displayDiscounts() {
        return invoker.displayTabTotal().getDiscounts();
    }
}
