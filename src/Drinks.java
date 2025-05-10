// This file should handle the drink options
// Limit to three drink options pepsi, dr.pepper, sprite
//should be called in the main file
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
