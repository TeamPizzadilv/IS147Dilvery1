import java.util.*;

public class PizzaOrderSystem {

    static Scannner scanner = new Scanner(System.in);
    static String customerAddress;
    static List<String> orderitems = new ArrayList<>();
    static double totalCost = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to IS147 Pizza Shop!");
        enterAddress();
        selectPizza();
        selectSides();
        selectDessertsandDrinks();
        checkout();
    }

    public static void enterAddress() {
        System.out.print("Please enter your address");
        customerAddress = scanner.nextLine();
    }

    //Methods for later steps
    public static void selectPizza() {}
    public static void selectSides() {}
    public static void selectDessertsandDrinks() {}
    public static void checkout() {}
}
