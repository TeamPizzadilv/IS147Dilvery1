// this file should take care of the pasta options limit it to three options
//chicken alfredo- $9, buffalo chicken alfredo-$10, fettucine alfredo-$ 8.
//use a loop to ask if the customer wants to add any more pasta when done/exit used move to next menu item.
//should be called and printed in the main.
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