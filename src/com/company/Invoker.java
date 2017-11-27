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


}

class DisplayMenu implements Command{

    private Aggregator a;

    public DisplayMenu(Aggregator a) {
        this.a = a;
    }

    @Override
    public Menu execute() {
        return a.getMenu();
    }
}
