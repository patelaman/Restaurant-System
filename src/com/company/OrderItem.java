package com.company;

public class OrderItem {

    private int itemNumber;

    public OrderItem(MenuItem m) {
        this.itemNumber = m.getItemNumber();
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

}
