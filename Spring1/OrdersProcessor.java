package ua.kiev.prog;

import java.util.List;

public class OrdersProcessor {
    private OrdersDAO ordersDAO;

    public void setOrdersDAO(OrdersDAO ordersDAO) {
        this.ordersDAO = ordersDAO;
    }

    public void process() {
        List<Order> list = ordersDAO.getOrders();

        for (Order o : list)
            System.out.println(o);
    }
}


