import java.util.Random;

//This file should use the math function in order to add up the customers order total.
// should take the price of everything they input and at it up to be printed and the main under receipt
public class AddedTotal {
}
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