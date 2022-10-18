public class Menu {
    private int userChoice;
    private String menuHeader;
    private String leadText;
    private String[] menuItems = {"1: CREATE ORDER", "2: PIZZAMENU", "3: ORDER LIST" ,"4: Create Pizza", "9: QUIT"};

    private boolean tryAgain = true;

    public Menu(String menuHeader, String leadText, String[] menuItems) {
        printMenu();
        readChoice();
    }

    public void printMenu() {
        menuHeader = "MENU:";
        leadText = "Please Choose: ";
        System.out.println(menuHeader);
        System.out.println(toString());
        System.out.println(leadText);
    }


    @Override
    public String toString() {
        return menuItems[0] + "\n" + menuItems[1] + "\n" + menuItems[2] + "\n" + menuItems[3];
    }

    public int readChoice() {

        while (tryAgain) {


            userChoice = MarioPizzabarRun.in.nextInt();


            switch (userChoice) {
                case 1:
                    System.out.println(menuItems[0]);
                    new Order("").createOrder();
                    new OrderList().createOrderlist();
                    tryAgain = false;
                    break;
                case 2:
                    new PizzaMenu().printPizzaMenu();
                    tryAgain = false;
                    break;
                case 3:
                    System.out.println(menuItems[2]);
                    tryAgain = false;
                    break;
                case 4:
                    System.out.println(menuItems[3]);
                    tryAgain = false;
                    break;
                case 9:
                    System.out.println(menuItems[4]);
                    tryAgain = false;
                    break;
                default:
                    System.out.println("Please choose a valid option!");
                    System.out.println();
            }
            if (tryAgain) {
                printMenu();
                readChoice();
            }
        }
        return userChoice;

    }
}
