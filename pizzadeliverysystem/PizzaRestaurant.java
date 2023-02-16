package pizzadeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class PizzaRestaurant {

    private List<Pizza> pizzas;
    private List<Order> orders;

    PizzaRestaurant(){
        this.pizzas = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addCustomer(Order order){
        orders.add(order);
    }

    public void takingOrder(Order order, Pizza pizza){
        if (pizzas.contains(pizza) && pizza.isAvailability()){
            order.pizzasOrder(pizza);
            pizza.setAvailability(false);
        }else {
            System.out.println("This pizza is not available.");
        }
    }

    public void preparePizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void displayMenu(){
        if (pizzas.isEmpty()) {
            System.out.println("No pizza available.");
        }else {
            for (Pizza p : pizzas){
                System.out.println("Size:           " + p.getSize());
                System.out.println("Toppings :      " + p.getToppings());
                System.out.println("Price :         " + p.getPrice());
                System.out.println("Availability:   " + ((p.isAvailability()) ? "Yes" : "No"));
            }
        }
    }

    public void pizzaOrdered(){
        if (pizzas.isEmpty()) {
            System.out.println("You have no pizza prepared.");
        }else {
            if (orders.isEmpty()) {
                System.out.println("You have no orders.");
            }else {
                System.out.println("Orders:");
                for (Order o : orders){
                    System.out.println("Name:               " + o.getCustomerName());
                    System.out.println("Delivery Address:   " + o.getDeliveryAddress());
                    for (Pizza p : o.getPizzasOrder()){
                        System.out.println("Pizza(size) :       " + p.getSize());
                        System.out.println("Pizza(toppings) :   " + p.getToppings());
                        System.out.println("Pizza(price) :      " + p.getPrice());
                    }
                }
            }
        }
    }

}
