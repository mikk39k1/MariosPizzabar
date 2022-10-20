import java.time.LocalDateTime;
import java.util.Scanner;

public class Order {
    Scanner in = new Scanner(System.in);
    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime;


    // SETTERS


    public void readCustomerName() {
        System.out.println("Write the name of the customer");
        this.customerName = MarioPizzabarRun.in.nextLine();
        in.nextLine();

    }

    public void readCustomerPhone() {
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
        new OrderList().getOrderList().add(new Order(null,null));
    }

    //CONSTRUCTORS
    public Order(String customerName, String customerPhonenumber){
        readCustomerName();
        readCustomerPhone();
    }




    @Override
    public String toString() {
        return "Order: " +
                "Customer Name: " + getCustomerName() + '\'' +
                "Customer Phone nr.: " + getCustomerPhonenumber();
    }
}
