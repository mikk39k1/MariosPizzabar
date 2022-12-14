import java.util.ArrayList;
import java.util.Collections;


public class PizzaMenu {
    private int pizzaChoice;
    private static ArrayList<Pizza> pizzaMenu = new ArrayList<>();


    public static ArrayList<Pizza> createPizzaMenu() {
        pizzaMenu.add(new Pizza(1, "Vesuvio: ", "Tomatsauce, ost, skinke og oregano", 57));
        pizzaMenu.add(new Pizza(2, "Amerikaner: ", "Tomatsauce, ost, oksefars og oregano", 53));
        pizzaMenu.add(new Pizza(3, "Cacciatore: ", "Tomatsauce, ost, pepperoni og oregano", 57));
        pizzaMenu.add(new Pizza(4, "Carbona: ",
                "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser oregano", 63));
        pizzaMenu.add(new Pizza(5, "Dennis: ",
                "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano", 65));
        pizzaMenu.add(new Pizza(6, "Bertil: ", "Tomatsauce, ost, bacon og oregano", 57));
        pizzaMenu.add(new Pizza(7, "Silvia: ",
                "Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano", 61));
        pizzaMenu.add(new Pizza(8, "Victoria: ",
                "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 57));
        pizzaMenu.add(new Pizza(9, "Toronfo: ", "Tomatsauce, ost, bacon, kebab, chili og oregano", 61));
        pizzaMenu.add(new Pizza(10, "Capricciosa: ", "Tomatsauce, ost, skinke, champignon og oregano", 61));

        return pizzaMenu;
    }


    public static ArrayList<Pizza> getPizzaMenu() {
        for (int i = 0; i < pizzaMenu.size(); i++) {
            System.out.println(pizzaMenu.get(i));
        }
        return pizzaMenu;
    }



    public void setPizzaChoice() {
        System.out.println(Colors.GREEN + "CHOOSE A PIZZA: " + Colors.RESET);
        System.out.println();
        getPizzaMenu();
        pizzaChoice = MarioPizzabarRun.in.nextInt();
    }

    public Pizza getPizzaChoice(){
        return pizzaMenu.get(pizzaChoice - 1);
    }
}



