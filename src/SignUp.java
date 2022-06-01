import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to JavaGram! Let's sign you up.");
        int counter = 00;


        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("\nWhat's your name?");
        String name = scan.nextLine();
        counter++;

        //Ask for their last name.
        System.out.println("\nWhat's your last name?");
        String lastName = scan.nextLine();
        counter++;

        //Ask: how old are you?
        System.out.println("\nHow old are you?");
        int age = scan.nextInt();
        counter++;

        /* Ask them to make a username. SIDE NOTE:
           â€“ nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           â€“ You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           â€“ For now, just know that the solution is to add an extra nextLine().
        */
        System.out.println("\nCan you make your username?");
        String username = scan.nextLine();
        String username1 = scan.nextLine();
        counter++;

        //Ask what city they live in.
        System.out.println("\nWhat city do you live in?");
        String city = scan.nextLine();
        counter++;

        //Ask what country that's from.
        System.out.println("\nWhat country is that from?");
        String country = scan.nextLine();
        counter++;


        //Task 2 - Print their information.

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");

        //Print their information like so:

        System.out.println("\tFirst Name: " + name);
        System.out.println("\tLast Name: " + lastName);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username1);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);
        System.out.println("\tThank you for answering all " + counter + " questions.");
        scan.close();

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D !
    }
    }
