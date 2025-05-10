import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String customerAddress;
    static List<String> orderItems = new ArrayList<>();
    static double totalCost = 0;

    public static void main(String[] args) {
        while (true) {
            // Reset for a new order
            orderItems.clear();
            totalCost = 0;

            System.out.println("\nWelcome to Java Pizza Shop!");
            enterAddress();
            selectPizza();
            selectSides();
            selectDessertsAndDrinks();
            checkout();

            System.out.print("\nWould you like to place another order? (yes/no): ");
            String again = scanner.nextLine();
            if (!again.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for visiting Java Pizza Shop! Goodbye.");
                break;
            }
        }
    }

    public static void enterAddress() {
        System.out.print("Please enter your delivery address: ");
        customerAddress = scanner.nextLine();
    }

    public static void selectPizza() {
        System.out.println("\n--- Pizza Customization ---");

        // Size selection
        System.out.println("Type number to choose pizza size:\n1. Small ($8)\n2. Medium ($10)\n3. Large ($12)");
        int sizeChoice = scanner.nextInt();
        scanner.nextLine(); // Clear newline
        switch (sizeChoice) {
            case 1 -> { orderItems.add("Small Pizza"); totalCost += 8; }
            case 2 -> { orderItems.add("Medium Pizza"); totalCost += 10; }
            case 3 -> { orderItems.add("Large Pizza"); totalCost += 12; }
        }

        // Crust selection
        System.out.println("Type number to Choose crust:\n1. Thin\n2. Thick\n3. Stuffed");
        int crustChoice = scanner.nextInt();
        scanner.nextLine();
        String crust = switch (crustChoice) {
            case 1 -> "Thin Crust";
            case 2 -> "Thick Crust";
            case 3 -> "Stuffed Crust";
            default -> "Regular Crust";
        };
        orderItems.add(crust);

        // Toppings
        System.out.println("Choose toppings (type 'done' to finish):");
        String[] availableToppings = {"Pepperoni", "Sausage", "Bacon", "Mushrooms", "Peppers", "Extra cheese",};
        for (String topping : availableToppings) {
            System.out.println("- " + topping);
        }

        while (true) {
            System.out.print("Add topping: ");
            String topping = scanner.nextLine();
            if (topping.equalsIgnoreCase("done")) break;
            orderItems.add("Topping: " + topping);
            totalCost += 1.5;
        }
    }

    public static void selectSides() {
        System.out.println("\n--- Select Sides ---");

        System.out.println("Do you want any wings? (yes/no)");
        String wingsAnswer = scanner.nextLine();
        if (wingsAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Type Number to choose wing flavor:\n1. Buffalo\n2. BBQ\n3. Garlic Parmesan");
            int flavorChoice = scanner.nextInt();
            scanner.nextLine();

            String flavor = switch (flavorChoice) {
                case 1 -> "Buffalo Wings";
                case 2 -> "BBQ Wings";
                case 3 -> "Garlic Parmesan Wings";
                default -> "Regular Wings";
            };

            System.out.print("How many wings? (e.g., 6 for $6, 12 for $11): ");
            int count = scanner.nextInt();
            scanner.nextLine();

            orderItems.add(count + " " + flavor);
            totalCost += (count <= 6) ? 6 : 11;
        }

        System.out.println("Do you want any pasta? (yes/no)");
        String pastaAnswer = scanner.nextLine();
        if (pastaAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Type number to choose pasta:\n1. Chicken Alfredo ($9)\n2. Buffalo Chicken Alfredo ($10)");
            int pastaChoice = scanner.nextInt();
            scanner.nextLine();

            String pasta = switch (pastaChoice) {
                case 1 -> "Chicken Alfredo Pasta";
                case 2 -> "Buffalo Chicken Pasta";
                default -> "Pasta";
            };

            orderItems.add(pasta);
            totalCost += (pastaChoice == 1) ? 9 : 10;
        }
    }

    public static void selectDessertsAndDrinks() {
        System.out.println("\n--- Desserts & Drinks ---");

        // Selecting Desserts
        System.out.println("Would you like a dessert? (yes/no)");
        String dessertAnswer = scanner.nextLine();
        if (dessertAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Type Number to choose dessert:\n1. Lava Cake ($4)\n2. Pizza Cookie ($4)\n3. Brownie ($3)");
            int dessertChoice = scanner.nextInt();
            scanner.nextLine();

            switch (dessertChoice) {
                case 1 -> { orderItems.add("Lava Cake"); totalCost += 4; }
                case 2 -> { orderItems.add("Pizza Cookie"); totalCost += 4; }
                case 3 -> { orderItems.add("Brownie"); totalCost += 3; }
            }
        }

        // Drinks
        System.out.println("Would you like a drink? (yes/no)");
        String drinkAnswer = scanner.nextLine();
        if (drinkAnswer.equalsIgnoreCase("yes")) {
            System.out.println("Type Number to choose drink:\n1. Pepsi ($2)\n2. Dr.Pepper ($1.5)\n3. Sprite ($2.5)");
            int drinkChoice = scanner.nextInt();
            scanner.nextLine();

            switch (drinkChoice) {
                case 1 -> { orderItems.add("Pepsi"); totalCost += 2; }
                case 2 -> { orderItems.add("Dr.Pepper"); totalCost += 1.5; }
                case 3 -> { orderItems.add("Sprite"); totalCost += 2.5; }
            }
        }
    }

    public static void checkout() {
        System.out.println("\n--- Checkout ---");
        System.out.println("Delivery Address: " + customerAddress);
        System.out.println("Your Order:");

        for (String item : orderItems) {
            System.out.println(" - " + item);
        }

        System.out.printf("Total Cost: $%.2f%n", totalCost);

        System.out.println("\nWould you like to confirm your order and proceed to payment? (yes/no)");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Payment error.");
            }

            System.out.println("Payment successful!");

            int estimatedTime = 30 + new Random().nextInt(31);
            System.out.println("Your order has been placed! Estimated delivery time: " + estimatedTime + " minutes.");
        } else {
            System.out.println("Order cancelled.");
        }
    }
}

