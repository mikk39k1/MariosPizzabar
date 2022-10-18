import java.time.LocalDateTime;

public class Order {
    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime;


    // SETTERS

    public void setCustomerName(String customerName) {
        customerName = MarioPizzabarRun.in.nextLine();
        this.customerName = customerName;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        customerPhonenumber = MarioPizzabarRun.in.nextLine();
        this.customerPhonenumber = customerPhonenumber;
    }


    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // GETTERS

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    //METHODS

    public void createOrder(){
        setCustomerName(customerName);
        setCustomerPhonenumber(customerPhonenumber);
    }

    // CONSTRUCTORS
    public Order(String customerName){
        createOrder();
    }








}
