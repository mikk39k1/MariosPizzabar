import java.time.LocalDateTime;
import java.util.Scanner;

public class Order {
    Scanner in = new Scanner(System.in);
    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime;




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
        readCustomerPhone(customerPhonenumber);
        in.nextLine();
        readCustomerName(customerName);
        PizzaMenu.getPizzaIndex();

    }



    @Override
    public String toString() {
        return "Order: " +
                "Pizza Number: " + PizzaMenu.getPizzaIndex() +
                "Customer Name: " + getCustomerName() +
                "Customer Phone nr.: " + getCustomerPhonenumber();
    }
}
