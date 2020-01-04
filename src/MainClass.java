import model.Order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

    public static void main(String[]args){
        //ArrayList to hold order models
        ArrayList<Order.OrderStructure> orderArrayList = new ArrayList<>();

        //Add Orders to the arrayList
        Order.OrderStructure order = new Order.OrderStructure();
        order.setOrderNo("001");
        order.setAmount(60.00);
        orderArrayList.add(order);

        Order.OrderStructure order2 = new Order.OrderStructure();
        order2.setOrderNo("002");
        order2.setAmount(450.00);
        orderArrayList.add(order2);

        Order.OrderStructure order3 = new Order.OrderStructure();
        order3.setOrderNo("003");
        order3.setAmount(230.00);
        orderArrayList.add(order3);

        Order.OrderStructure order4 = new Order.OrderStructure();
        order4.setOrderNo("004");
        order4.setAmount(220.00);
        orderArrayList.add(order4);

        //Sort List
        Collections.sort(orderArrayList, new Comparator<Order.OrderStructure>() {
            @Override
            public int compare(Order.OrderStructure order, Order.OrderStructure t1) {
                return (int) (t1.getAmount() - order.getAmount());
                //return String.valueOf(t1.getAmount()).compareTo(String.valueOf(order.getAmount()));
            }
        });

        for (Order.OrderStructure orderItem:orderArrayList){
            System.out.println(" "+orderItem.getOrderNo()+ "  "+orderItem.getAmount());
        }
    }
}
