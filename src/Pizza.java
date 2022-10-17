public class Pizza {
    private int number;
    private String name;
    private String toppings;
    private int price;


    // SETTERS

    public void setNumber(int number){
        number = MarioPizzabarRun.in.nextInt();
        this.number = number;
    }

    public void setName(String name){
        name = MarioPizzabarRun.in.nextLine();
        this.name = name;
    }

    public void setToppings(String toppings){
        toppings = MarioPizzabarRun.in.nextLine();
        this.toppings = toppings;
    }

    public void setPrice(int price){
        price = MarioPizzabarRun.in.nextInt();
        this.price = price;
    }

    // GETTERS

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public String getToppings(){
        return toppings;
    }

    public int getPrice(){
        return price;
    }

    // METHODS

}
