// this file should take care of the pizza options limit it to 4 options
//use a loop to ask if the customer wants to add any more pizza when done/exit used move to next menu item.
//should be called and printed in the main.
public static void selectPizza() {}
        System.out.println("\n--- Pizza Customization---"");

                           //selecting the size
                           System.out.println("Choose pizza size:\n1. Small ($8)\n2. Medium ($10")\n3. Large ($12)");
int sizeChoice = scanner.nextInt();
        scanner.nextLine();
        switch (sizeChoice)

        {
        case 1:
        orderItems.add("Small Pizza");
totalCost += 8;
        break;
        case 2
        orderItems.add("Medium Pizza");
totalCost += 10;
        break;
        case 3
        orderItems.add("Large Pizza");
totalCost += 12;
        break;
        }

        //Selecting type of Crust
        System.out.println("Choose crust:"\n1. Thin\n2. Thick\n3. Stuffed");
        int crustChoice = scanner.nextInt();
    scanner.nextLine();
String crust = switch (crustChoice) {
    case 1 -> "Thin Crust";
    case 2 -> "Thick Crust";
    case 3 -> "Stuffed Crust";
    default -> "Regular Crust";
};
    orderItems.add(crust);

//Selecting toppings
    System.out.println("Choose toppings (type 'done' to end):");
String[] availableToppings = {"Pepperoni", 'Sausage", "Bacon", "Mushrooms", "Peppers"};
    for(
String topping :availableToppings)

        {
        System.out.println("- " + topping);
    }

            while(true)

            {
            System.out.print("Add topping: ");
String topping = scanner.nextLine();
        if (topping.equalsIgnoreCase("done")) break;
        orderItems.add("Topping: " + topping);
totalCost += 1.5; //Price per additional topping
        }

        }
