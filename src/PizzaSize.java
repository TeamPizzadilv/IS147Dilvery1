// This file should be use to ask what size pizza the customer wants. Should be called in the main
//This should extend from the pizza file. Should be asked what pizza they want then what size the want
//Should offer small, medium or large pizza
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