import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    PizzaMenu pizzaMenu = new PizzaMenu();
    Pizza pizza = new Pizza();
    private boolean hasPaid = false;
    private int orderId;
    private static int count = 0;

    private String customerName;
    private String customerPhonenumber;
    private LocalDateTime dateTime = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private String formatDateTime = dateTime.format(formatter);




    // SETTERS

    public void setHasPaid(){
        this.hasPaid = true;
    }

    public void readCustomerName(String customerName) {
        System.out.println(Colors.GREEN + "WRITE CUSTOMER NAME" + Colors.RESET);
        this.customerName = MarioPizzabarRun.in.nextLine();


    }

    public void readCustomerPhone(String customerPhonenumber) {
        System.out.println(Colors.GREEN + "WRITE CUSTOMER PHONENUMBER" + Colors.RESET);
        this.customerPhonenumber = MarioPizzabarRun.in.nextLine();

    }


    // GETTERS
    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerPhonenumber(){
        return customerPhonenumber;
    }

    public boolean getHasPaid(){
        return hasPaid;
    }


    //METHODS


    public void changeHasPaid(){
        int orderChoice;
        System.out.println(Colors.GREEN + "WHICH ORDER DO YOU WISH TO PAY FOR?" + Colors.RESET);
        orderChoice = MarioPizzabarRun.in.nextInt() - 1;
        for (int i = 0; i < OrderList.orderList.size(); i++) {
            if (orderChoice == i){
                OrderList.orderList.get(i).setHasPaid();
            }
        }
    }

    public static void setCustomerOrder(){
        OrderList.getOrderList().add(new Order("",""
                + new Pizza(0,"","",0)));
    }



    //CONSTRUCTORS

    public Order(String customerName, String customerPhonenumber){
        MarioPizzabarRun.in.nextLine();
        readCustomerPhone(customerPhonenumber);
        readCustomerName(customerName);
        pizzaMenu.setPizzaChoice();
        MarioPizzabarRun.in.nextLine();
        orderId = ++count;
    }

    public Order() {
    }




    @Override
    public String toString() {
        if (!getHasPaid()){
            return "Order nr.: " + orderId + '\n' +
                    "Pizza Number: " + pizzaMenu.getPizzaChoice().getPizzaNumber() + '\n' +
                    "Pizza Price: " + pizzaMenu.getPizzaChoice().getPrice() + ",-" + '\n' +
                    "Is Pizza Paid? " + Colors.RED + hasPaid + Colors.RESET + '\n' +
                    "Customer Name: " + getCustomerName() + '\n' +
                    "Customer Phone nr.: " + getCustomerPhonenumber() + '\n' +
                    "Time order was made: " + formatDateTime;
        } else {
            return "Order nr.: " +  orderId + '\n' +
                    "Pizza Number: " + pizzaMenu.getPizzaChoice().getPizzaNumber() + '\n' +
                    "Pizza Price: " + pizzaMenu.getPizzaChoice().getPrice() + ",-" + '\n' +
                    "Is Pizza Paid? " + Colors.GREEN + hasPaid + Colors.RESET + '\n' +
                    "Customer Name: " + getCustomerName() + '\n' +
                    "Customer Phone nr.: " + getCustomerPhonenumber() + '\n' +
                    "Time order was made: " + formatDateTime;
        }


    }
}
