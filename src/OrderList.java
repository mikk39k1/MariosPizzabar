import java.util.ArrayList;

public class OrderList {
    Order order = new Order();

    static ArrayList<Order> orderList = new ArrayList<>();





    public static ArrayList<Order> getOrderList() {
        for (int i = 0; i < orderList.size(); i++){}
        return orderList;
    }

    public static void printOrderList() {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
            System.out.println();
        }
    }

    public void sumOfOrders(){
        int sumDay = 0;
        for (int i = 0; i < OrderList.orderList.size(); i++) {
            if (OrderList.orderList.get(i).getHasPaid()){
                sumDay += OrderList.orderList.get(i).pizzaMenu.getPizzaChoice().getPrice();
            }
        }
        System.out.println("Revenue of the day: " + sumDay + ",-");
        System.out.println();
    }


}
