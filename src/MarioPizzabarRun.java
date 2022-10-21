import java.util.Scanner;

public class MarioPizzabarRun {
    public static Scanner in = new Scanner(System.in);
    Menu menu = new Menu("MARIOS PIZZA", "PLEASE CHOOSE:",
            new String[] {"1: CREATE ORDER", "2: PIZZAMENU", "3: ORDER LIST", "4: Create Pizza", "9: QUIT"});

    void run(){
        menu.printMenu();
    }

    public static void main(String[] args) {
        new MarioPizzabarRun().run();
    }
}
