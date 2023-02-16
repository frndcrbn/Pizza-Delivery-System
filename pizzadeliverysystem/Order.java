package pizzadeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String customerName, deliveryAddress;
    private List<Pizza> pizzasOrder;

    Order(String customerName, String deliveryAddress){
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.pizzasOrder = new ArrayList<>();
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public List<Pizza> getPizzasOrder(){
        return pizzasOrder;
    }

    public void pizzasOrder(Pizza pizza){
        pizzasOrder.add(pizza);
    }
}
