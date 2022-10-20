import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {

    static ArrayList<Order> orderList = new ArrayList<>();



    public static void printOrderlist(){
        for (Order value : orderList) {
            System.out.println(value);
        }
    }

    public ArrayList<Order> getOrderList(){
        return orderList;
    }





}
