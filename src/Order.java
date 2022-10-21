import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Order {
    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private String formatDateTime = dateTime.format(formatter);




    // SETTERS

    public void readCustomerName(String customerName) {
        System.out.println("Write the name of the customer");
        this.customerName = MarioPizzabarRun.in.nextLine();


    }

    public void readCustomerPhone(String customerPhonenumber) {
        System.out.println("Write the phone number for the customer");
        this.customerPhonenumber = MarioPizzabarRun.in.nextLine();

    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // GETTERS
    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerPhonenumber(){
        return customerPhonenumber;
    }

    //METHODS


    public static void setCustomerOrder(){
        new OrderList().getOrderList().add(new Order("","" +
                new Pizza(0,"","",0)));
    }

    //CONSTRUCTORS
    public Order(String customerName, String customerPhonenumber){
        MarioPizzabarRun.in.nextLine();
        readCustomerPhone(customerPhonenumber);
        readCustomerName(customerName);
    }



    @Override
    public String toString() {
        return "Order: " +
                "Pizza Number: " + PizzaMenu.getPizzaIndex().getPizzaNumber() +
                " Customer Name: " + getCustomerName() +
                " Customer Phone nr.: " + getCustomerPhonenumber() +
                " Time order was made: " + formatDateTime;
    }
}
