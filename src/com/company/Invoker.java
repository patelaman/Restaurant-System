package com.company;

public class Invoker {

    public Aggregator aggregator;

    public Invoker(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public Menu displayMenu() {
        DisplayMenu displayMenu = new DisplayMenu(aggregator);
        return displayMenu.execute();
    }

    public OrderItem submitOrder(int itemNumber) {
        SubmitOrder submitOrder = new SubmitOrder(aggregator, itemNumber);
        return submitOrder.execute();
    }

    public Tab displayTab() {
        DisplayTab displayTab = new DisplayTab(aggregator);
        return displayTab.execute();
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

class SubmitOrder implements Command{

    private Aggregator aggregator;
    private int itemNumber;

    public SubmitOrder(Aggregator aggregator, int itemNumber){
        this.aggregator = aggregator;
        this.itemNumber = itemNumber;
    }

    @Override
    public OrderItem execute() {
        OrderItem orderItem = new OrderItem(aggregator.getMenu().getMenuItem(itemNumber).getItemNumber());
        aggregator.getOrders().getOrderItems().add(orderItem);
        return orderItem;
    }
}

class DisplayTab implements Command{

    private Aggregator aggregator;

    public DisplayTab(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Tab execute() {
        Tab tab = new Tab(aggregator.getOrders(), aggregator.getMenu());
        return tab;
    }
}
