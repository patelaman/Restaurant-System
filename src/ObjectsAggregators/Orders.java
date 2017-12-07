package ObjectsAggregators;

import java.util.ArrayList;

public class Orders {

    private ArrayList<OrderItem> orderItems;

    public Orders() {
        this.orderItems = new ArrayList();
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }
}
