public class Pizza {
    private int number;
    private String name;
    private String toppings;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    // CONSTRUCTOR

    public Pizza(int number, String name, String toppings, int price){
        setNumber(number);
        setName(name);
        setToppings(toppings);
        setPrice(price);
    }

}
