package com.company;

public class SystemInterface {

    private static Invoker invoker;

    public void setInvoker() {
        invoker = new Invoker(new Aggregator());
    }

    public Invoker getInvoker() {
        return invoker;
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

    public int[] submitOrder(int itemNumber) {
        invoker.submitOrder(itemNumber);
        int[] order = {itemNumber};
        return order;
    }

    public String[] displayTab() {
        return invoker.displayTab().getTab();
    }
}
