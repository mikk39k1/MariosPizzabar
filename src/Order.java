import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    PizzaMenu pizzaMenu = new PizzaMenu();
    private boolean hasPaid = true;

    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private String formatDateTime = dateTime.format(formatter);




    // SETTERS

    public boolean setHasPaid(){
        return this.hasPaid = false;
    }

    public void readCustomerName(String customerName) {
        System.out.println("Write the name of the customer");
        this.customerName = MarioPizzabarRun.in.nextLine();


    }

    public void readCustomerPhone(String customerPhonenumber) {
        System.out.println("Write the phone number for the customer");
        this.customerPhonenumber = MarioPizzabarRun.in.nextLine();

    }




    // GETTERS
    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerPhonenumber(){
        return customerPhonenumber;
    }

    public boolean hasPaid(){
        return hasPaid;
    }

    //METHODS


    public boolean changeHasPaid(){
        int orderChoice;
        System.out.println("Which order do you wish to change?");
        orderChoice = MarioPizzabarRun.in.nextInt() - 1;
        for (int i = 0; i < OrderList.orderList.size(); i++) {
            if (orderChoice == i){
                System.out.println(OrderList.orderList.get(i));
                this.hasPaid = true;
            }
        }
        return hasPaid;
    }

    public static void setCustomerOrder(){
        OrderList.getOrderList().add(new Order("",""  + new Pizza(0, "", "", 0)));
    }



    //CONSTRUCTORS
    public Order(String customerName, String customerPhonenumber){
        MarioPizzabarRun.in.nextLine();
        readCustomerPhone(customerPhonenumber);
        readCustomerName(customerName);
        pizzaMenu.setPizzaChoice();
        MarioPizzabarRun.in.nextLine();
        setHasPaid();
    }

    public Order(){
    }




    @Override
    public String toString() {
        return "Order: " + '\n' +
                "Pizza Number: " + pizzaMenu.getPizzaChoice().getPizzaNumber() + '\n' +
                "Pizza Price: " + pizzaMenu.getPizzaChoice().getPrice() + ",-" + '\n' +
                "Is Pizza Paid? " + hasPaid + '\n' +
                "Customer Name: " + getCustomerName() + '\n' +
                "Customer Phone nr.: " + getCustomerPhonenumber() + '\n' +
                "Time order was made: " + formatDateTime;
    }
}
