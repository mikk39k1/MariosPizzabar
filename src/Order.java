import java.time.LocalDateTime;

public class Order {
    private String customerName;
    private String customerPhonenumber;
    private int pizzaNumber;
    private LocalDateTime dateTime;


    // SETTERS

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }

    public void setPizzaNumber(int pizzaNumber) {
        this.pizzaNumber = pizzaNumber;
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

    public int getPizzaNumber() {
        return pizzaNumber;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    //METHODS

    public void createOrder(){
        setCustomerName(customerName);
        setCustomerPhonenumber(customerPhonenumber);
        LocalDateTime dateTime1 = LocalDateTime.now();
        setPizzaNumber(pizzaNumber);
    }








}
