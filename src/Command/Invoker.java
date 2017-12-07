package Command;

import Builder.CompleteDinnerMeal_1;
import Builder.CompleteDinnerMeal_2;
import Builder.CompleteMeals;
import ObjectsAggregators.Aggregator;
import ObjectsAggregators.Menu;
import ObjectsAggregators.OrderItem;
import ObjectsAggregators.Tab;

public class Invoker {

    public Aggregator aggregator;

    public Invoker(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public Menu displayMenu() {
        DisplayMenu displayMenu = new DisplayMenu(aggregator);
        return displayMenu.execute();
    }

    public CompleteMeals displayMeals() {
        DisplayMeals displayMeals = new DisplayMeals(aggregator);
        return displayMeals.execute();
    }

    public OrderItem submitOrder(int itemNumber) {
        SubmitOrder submitOrder = new SubmitOrder(aggregator, itemNumber);
        return submitOrder.execute();
    }

    public Tab displayTab() {
        DisplayTab displayTab = new DisplayTab(aggregator);
        return displayTab.execute();
    }

    public Tab displayTabTotal() {
        DisplayTabTotal displayTabTotal = new DisplayTabTotal(aggregator);
        return displayTabTotal.execute();
    }
}



class DisplayMenu implements Command{

    private Aggregator aggregator;

    public DisplayMenu(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Menu execute() {
        return aggregator.getMenu();
    }
}

class DisplayMeals implements Command{

    private Aggregator aggregator;

    public DisplayMeals(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public CompleteMeals execute() {
        return aggregator.getCompleteMeals();
    }
}

class SubmitOrder implements Command {

    private Aggregator aggregator;
    private int itemNumber;

    public SubmitOrder(Aggregator aggregator, int itemNumber) {
        this.aggregator = aggregator;
        this.itemNumber = itemNumber;
    }

    @Override
    public OrderItem execute() {
        if (itemNumber == 10) {
            aggregator.getCompleteMeals().getCompleteMeals().add(new CompleteDinnerMeal_1());
        }
        else if (itemNumber == 11) {
            aggregator.getCompleteMeals().getCompleteMeals().add(new CompleteDinnerMeal_2());
        }
        else {
            OrderItem orderItem = new OrderItem(itemNumber);
            aggregator.getOrders().getOrderItems().add(orderItem);
            return orderItem;
        }

        return null;
    }
}


class DisplayTab implements Command {

    private Aggregator aggregator;

    public DisplayTab(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Tab execute() {
        Tab tab = new Tab(aggregator.getOrders(), aggregator.getMenu(), aggregator.getCompleteMeals());
        return tab;
    }
}

class DisplayTabTotal implements Command {

    private Aggregator aggregator;

    public DisplayTabTotal(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Tab execute() {
        Tab tab = new Tab(aggregator.getOrders(), aggregator.getMenu(), aggregator.getCompleteMeals());
        return tab;
    }
}
