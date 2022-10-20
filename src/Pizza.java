public class Pizza {
    private static int pizzaNumber;
    private String pizzaName;
    private String toppings;
    private int price;

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setpizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }


    public static int getPizzaNumber(){
        return pizzaNumber;
    }

    public String getPizzaName(){
        return pizzaName;
    }

    public String getToppings(){
        return toppings;
    }

    public int getPrice(){
        return price;
    }

    // CONSTRUCTOR

    public Pizza(int pizzaNumber, String pizzaName, String toppings, int price){
        setpizzaNumber(pizzaNumber);
        setPizzaName(pizzaName);
        setToppings(toppings);
        setPrice(price);
    }

    public String toString() {
        return "Pizzamenu: " + pizzaNumber + " " + pizzaName + toppings
                + " - " + price + ",-" + "\n";
    }


}
