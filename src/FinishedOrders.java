import java.util.ArrayList;

public class FinishedOrders {
    static ArrayList<Order> finishedOrders = new ArrayList<>();


    public void printFinishedOrders(){
        for (int i = 0; i < finishedOrders.size(); i++) {
            System.out.println(finishedOrders.get(i));
            System.out.println();
        }
    }

    public static void moveOrderToFinishedOrders(){
        int orderChoice;

        System.out.println(Colors.GREEN + "CHOOSE ORDER YOU WISH TO MOVE TO FINISHED ORDERS: " + Colors.RESET);
        orderChoice = MarioPizzabarRun.in.nextInt() - 1;
        MarioPizzabarRun.in.nextLine();

        for (int i = 0; i < OrderList.orderList.size(); i++) {
            if (orderChoice == i) {
                System.out.println(OrderList.orderList.get(orderChoice));
            }
            if (OrderList.orderList.get(orderChoice).getHasPaid()==true){
                finishedOrders.add(OrderList.orderList.get(orderChoice));

                System.out.println();
                System.out.print(Colors.GREEN + "DO YOU WISH TO MOVE THIS ORDER?" + Colors.RESET
                        + Colors.BLUE + "press Y" + Colors.RESET);
                System.out.println();
                String confirmOrderChoice;
                confirmOrderChoice = MarioPizzabarRun.in.nextLine();
                if (confirmOrderChoice.equalsIgnoreCase("y")) {
                    OrderList.orderList.remove(orderChoice);
                }
            } else {
                System.out.println();
                System.out.println(Colors.GREEN + "Please change the order to \"Paid\"" + Colors.RESET);
                System.out.println();
            }




        }
    }

    public void sumOfOrders(){
        int sumDay = 0;
        for (int i = 0; i < finishedOrders.size(); i++) {
            if (finishedOrders.get(i).getHasPaid()){
                sumDay += finishedOrders.get(i).pizzaMenu.getPizzaChoice().getPrice();
            }
        }
        System.out.println(Colors.GREEN + "REVENUE OF THE DAY " + Colors.RESET
                + Colors.BLUE + sumDay + ",-" + Colors.RESET);
        System.out.println();
    }



}
