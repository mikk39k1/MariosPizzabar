public class Menu {
    private int userChoice;
    private String menuHeader;
    private String leadText;
    private String[] menuItems = {"1: CREATE ORDER", "2: PIZZAMENU", "3: ORDER LIST" ,"4: PAY FOR ORDER","5: REMOVE ORDER", "6: MOVE ORDER TO FINISHED", "7: PRINT FINISHED ORDERS", "9: QUIT"};

    private boolean tryAgain = true;
    Order order = new Order();
    OrderList orderList = new OrderList();
    FinishedOrders finishedOrders = new FinishedOrders();



    public Menu(String menuHeader, String leadText, String[] menuItems) {
        printMenu();
        readChoice();
    }

    public void printMenu() {
        menuHeader = "MENU:";
        leadText = "Please Choose: ";
        System.out.println(menuHeader);
        System.out.println(leadText);
    }


    @Override
    public String toString() {
        return menuItems[0] + "\n" + menuItems[1] + "\n" + menuItems[2] + "\n" + menuItems[3] + '\n' + menuItems[4] + '\n' + menuItems[5] + '\n' + menuItems[6];
    }

    public int readChoice() {

        while (tryAgain) {

            System.out.println(this);
            int userChoice = MarioPizzabarRun.in.nextInt();


            switch (userChoice) {
                case 1:
                    PizzaMenu.createPizzaMenu();
                    Order.setCustomerOrder();
                    break;
                case 2:
                    PizzaMenu.createPizzaMenu();
                    PizzaMenu.getPizzaMenu();
                    break;
                case 3:
                    OrderList.printOrderList();
                    break;
                case 4:
                    OrderList.printOrderList();
                    order.changeHasPaid();
                    break;
                case 5:
                    OrderList.printOrderList();
                    orderList.removeOrderFromOrderlist();
                    OrderList.printOrderList();
                    break;
                case 6:
                    OrderList.printOrderList();
                    FinishedOrders.moveOrderToFinishedOrders();
                    break;
                case 7:
                    finishedOrders.printFinishedOrders();
                    finishedOrders.sumOfOrders();
                    break;
                case 9:
                    System.out.println(menuItems[4]);
                    tryAgain = false;
                    break;
                default:
                    System.out.println("Please choose a valid option!");
                    System.out.println();
            }

        }
        return userChoice;

    }
}
