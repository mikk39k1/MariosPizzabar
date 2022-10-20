import java.time.LocalDateTime;
import java.util.Scanner;

public class Order {
    Scanner in = new Scanner(System.in);
    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime;


    // SETTERS


    public String readCustomerName() {
        System.out.println("Write the name of the customer");
        customerName = MarioPizzabarRun.in.nextLine();
        MarioPizzabarRun.in.nextLine();
        return customerName;

    }

    public String readCustomerPhone() {
        System.out.println("Write the phone number for the customer");
        customerPhonenumber = MarioPizzabarRun.in.nextLine();
        return customerPhonenumber;
    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // GETTERS


    //METHODS

    public static void setCustomerOrder(){
        new OrderList().getOrderList().add(new Order("",""));
    }

    // CONSTRUCTORS
    public Order(String customerName, String customerPhonenumber){
        readCustomerName();
        readCustomerPhone();
    }

    public Order(){

    }


    @Override
    public String toString() {
        return "Order: " +
                "Customer Name: " + customerName + '\'' +
                "Customer Phone nr.: " + customerPhonenumber;
    }
}
