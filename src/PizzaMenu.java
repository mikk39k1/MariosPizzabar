import java.util.ArrayList;
import java.util.Arrays;


public class PizzaMenu {
    Pizza vesuvio = new Pizza(1,"Vesuvio: ","Tomatsauce, ost, skinke og oregano",57);
    Pizza amerikaner = new Pizza(2,"Amerikaner: ","Tomatsauce, ost, oksefars og oregano",53);
    Pizza cacciatore = new Pizza(3,"Cacciatore: ","Tomatsauce, ost, pepperoni og oregano",57);
    Pizza carbona = new Pizza(4,"Carbona: ",
            "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser oregano",63);
    Pizza dennis = new Pizza(5,"Dennis: ",
            "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65);
    Pizza bertil = new Pizza(6,"Bertil: ","Tomatsauce, ost, bacon og oregano",57);
    Pizza silvia = new Pizza(7,"Silvia: ",
            "Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano",61);
    Pizza victoria = new Pizza(8,"Victoria: ",
            "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano",57);
    Pizza toronfo = new Pizza(9,"Toronfo: ","Tomatsauce, ost, bacon, kebab, chili og oregano",61);
    Pizza capricciosa = new Pizza(10,"Capricciosa: ","Tomatsauce, ost, skinke, champignon og oregano",61);
    private static ArrayList<Pizza> pizzaMenu = new ArrayList<Pizza>();




    public void printPizzaMenu(){
        pizzaMenu.add(new Pizza(1,"Vesuvio: ","Tomatsauce, ost, skinke og oregano",57));
        pizzaMenu.add(new Pizza(2,"Amerikaner: ","Tomatsauce, ost, oksefars og oregano",53));
        pizzaMenu.add(new Pizza(3,"Cacciatore: ","Tomatsauce, ost, pepperoni og oregano",57));
        pizzaMenu.add(new Pizza(4,"Carbona: ",
                "Tomatsauce, ost, kødsauce, spaghetti, cocktailpølser oregano",63));
        pizzaMenu.add(new Pizza(5,"Dennis: ",
                "Tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano",65));
        pizzaMenu.add(new Pizza(6,"Bertil: ","Tomatsauce, ost, bacon og oregano",57));
        pizzaMenu.add(new Pizza(7,"Silvia: ",
                "Tomatsauce, ost, pepperoni, rød peber, løg, oliven og oregano",61));
        pizzaMenu.add(new Pizza(8,"Victoria: ",
                "Tomatsauce, ost, skinke, ananas, champignon, løg og oregano",57));
        pizzaMenu.add(new Pizza(9,"Toronfo: ","Tomatsauce, ost, bacon, kebab, chili og oregano",61));

        pizzaMenu.add(new Pizza(10,"Capricciosa: ","Tomatsauce, ost, skinke, champignon og oregano",61));
        for (int i = 0; i < pizzaMenu.size(); i++) {
            System.out.println(Arrays.toString(pizzaMenu.toArray()));
        }
    }

}
