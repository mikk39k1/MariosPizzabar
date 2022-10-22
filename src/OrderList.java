import java.util.ArrayList;

public class OrderList {

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









}
