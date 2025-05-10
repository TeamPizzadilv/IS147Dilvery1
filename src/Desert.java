// This file should handle all deserts that are offered.
//limit to three deserts. Use brownie, pizza cookie, lava cake.
// should be called in the main file
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