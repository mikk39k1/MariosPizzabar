import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {
    static ArrayList<Order> orderList = new ArrayList<>();




    public static ArrayList<Order> getOrderList() {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
        return orderList;
    }





}
