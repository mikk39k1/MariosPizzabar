import java.util.ArrayList;
import java.util.Collections;

public class OrderList {
    Order order = new Order();

    static ArrayList<Order> orderList = new ArrayList<>();


    public void removeOrderFromOrderlist(){
        int orderChoice;
        System.out.println("Which order do you wish to move to finished orders?");
        orderChoice = MarioPizzabarRun.in.nextInt() -1;
        for (int i = 0; i < OrderList.orderList.size(); i++) {
            if (orderChoice == i){
                OrderList.orderList.remove(orderChoice);
            }
        }
    }


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
