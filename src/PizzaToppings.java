//this file should handle all the pizza topping: peperoni, sausage, bacon, mushrooms, peppers, the works (all of them).
// need to display the topping options to them then ask them to make a choice.
// This file should either implements or extends the pizza file have to check the definition of both of them.
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