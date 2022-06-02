import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome. Thank you for taking the survey");
        int counter = 0;

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        counter++;

        System.out.println("\nHow much money do you spend on coffee?");
        double coffePrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmmount = scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmmount = scanner.nextInt();
        counter++;

        System.out.println("\nThank you " + name + " for answering all " + counter + " questions!");
        System.out.println("Your fast food expenses are " + (foodPrice/coffePrice) + " times your coffee expenses.");
        System.out.println("Weekly you spend $ " + (coffeeAmmount*coffePrice) + " on coffee.");
        System.out.println("Weekly you spend $ " + (foodAmmount*foodPrice) + " on fast food.");


        scanner.close();

    }
}
