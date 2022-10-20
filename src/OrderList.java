import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {
    Order order = new Order();
    static ArrayList<Order> orderList = new ArrayList<>();



    public static void printOrderlist(){
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println((orderList.get(i)));
        }
    }

    public ArrayList<Order> getOrderList(){
        return orderList;
    }





}
