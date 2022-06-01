import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Java Dealership.");

        System.out.println(" ~ Select option 'a' to buy a car");
        System.out.println(" ~ Select option 'b' to sell a car");
        String option = scanner.nextLine();
        switch (option){
            case "a":
                System.out.println("What is your budget");
                int budget = scanner.nextInt();
                if(budget >= 10000){
                    System.out.println("Great! A Nissan Altima is available.");
                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scanner.nextLine();
                    String insurance = scanner.nextLine();
                    System.out.println("\nDo you have a license? Write 'yes' or 'no'");
                    String license = scanner.nextLine();
                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scanner.nextInt();
                    if (insurance.equals("yes") && license.equals("yes") && creditScore > 660);
                    System.out.println("Sold! Pleasure doing business with you");
                } else {
                    System.out.println("We are sorry. You are not eligible.");
                    System.out.println("We don't sell cars under $10,000. Sorry!");
                }
            case "b":
                System.out.println("\nWhat is your car valued at?");
                int value = scanner.nextInt();
                System.out.println("\nWhat is your selling price?");
                int price = scanner.nextInt();
                if(value > price && price < 30000){
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else{
                    System.out.println("Sorry, we're not interested!"); break;
                }
            default:
                System.out.println("Invalid input. Please select 'a' or 'b' option.");
                        }
                        scanner.close();

    }
}
