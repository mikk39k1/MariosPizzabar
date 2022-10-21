import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {
    static ArrayList<Order> orderList = new ArrayList<>();


    public static void printOrderlist(){
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(orderList.get(i));
        }
    }


    public static ArrayList<Order> getOrderList() {
        return (ArrayList<Order>) orderList;
    }





}
