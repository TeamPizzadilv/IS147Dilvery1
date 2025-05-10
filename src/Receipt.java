// te receipt should print back everything the customer ordered.
// Should be called in the main file.
//should only be printed if the customer answered yes when asked if they want a receipt.
public class Receipt {
}
System.out.println("\n--- Checkout ---");
System.out.println("Delivery Address: " + customerAddress);
System.out.println("Your Order:");

for (String item : orderItems) {
    System.out.println(" - " + item);
        }

System.out.printf("Total Cost: $%.2f%n", totalCost);