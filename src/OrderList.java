import java.util.ArrayList;

public class OrderList {
    Order order = new Order("");
    ArrayList<String> orderList = new ArrayList<String>();



    public void createOrderlist(){
        orderList.add(String.valueOf(new Order(Pizza.getPizzaNumber() + order.getCustomerName())));
    }

    public void printOrderlist(){
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(toString());
        }
    }

    private String toString(Order order) {
        return "OrderList: " + order.getCustomerName() + order.getCustomerPhonenumber();
    }







}
