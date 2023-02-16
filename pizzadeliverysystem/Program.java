package pizzadeliverysystem;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        PizzaRestaurant pizzaRestaurant = new PizzaRestaurant();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("[1] Add pizza.");
            System.out.println("[2] Add Customer.");
            System.out.println("[3] Order Pizza.");
            System.out.println("[4] View Order.");
            System.out.println("[0] Exit.");
            System.out.print("Enter here: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter size:       ");
                    String size = scanner.next();
                    System.out.print("Enter toppings:   ");
                    String toppings = scanner.next();
                    System.out.print("Enter price:      ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    pizzaRestaurant.preparePizza(new Pizza(size, toppings, price));
                    System.out.println("Pizza added.");
                    break;
                case 2:
                    System.out.print("Enter name:       ");
                    String cus_name = scanner.next();
                    System.out.print("Enter address:    ");
                    String cus_address = scanner.next();
                    pizzaRestaurant.addCustomer(new Order(cus_name, cus_address));
                    System.out.println("Customer added.");
                    break;
                case 3:
                    System.out.println("Menu: ");
                    pizzaRestaurant.displayMenu();
                    System.out.print("Enter customer(name): ");
                    String name = scanner.next();
                    System.out.print("Enter pizza(size):    ");
                    size = scanner.next();
                    Order order = pizzaRestaurant.getOrders().stream().filter(o -> o.getCustomerName().equals(name)).findFirst().orElse(null);
                    Pizza pizza = pizzaRestaurant.getPizzas().stream().filter(p -> p.getSize().equals(size)).findFirst().orElse(null);
                    if (order != null && pizza != null) {
                        pizzaRestaurant.takingOrder(order, pizza);
                        System.out.println("Pizza ordered.");
                    }else {
                        System.out.println("This pizza is not available.");
                    }
                    break;
                case 4:
                    System.out.println("Pizza Ordered");
                    pizzaRestaurant.pizzaOrdered();
                    break;
                case 0:
                    System.out.println("Thank you for using us.");
                    System.exit(0);
                default:
                    System.out.println("Please select of the choices only.");
                    break;
            }
        }
    }
}
