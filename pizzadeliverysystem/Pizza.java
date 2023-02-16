package pizzadeliverysystem;

public class Pizza {

    private String size, toppings;
    private double price;
    private boolean availability;

    Pizza(String size, String toppings, double price){
        this.size = size;
        this.toppings = toppings;
        this.price = price;
        this.availability = true;
    }

    public String getSize(){
        return size;
    }

    public  String getToppings(){
        return toppings;
    }

    public double getPrice(){
        return price;
    }

    public boolean isAvailability(){
        return availability;
    }

    public void setAvailability(boolean availability){
        this.availability = availability;
    }
}
