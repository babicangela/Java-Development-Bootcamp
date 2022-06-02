import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 00;

        System.out.println("1. Which country held the 2016 summer OLtmpics?");
        System.out.println("\ta) China\n\tb) Irelan\n\tc) Brazil\n\td) Italy\n\t");
        String answer1 = scanner.nextLine();
        counter++;

        System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n\t");
        String answer2 = scanner.nextLine();
        counter++;

        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-\n\t");
        String answer3 = scanner.nextLine();
        counter++;

        System.out.println("\n4. Which of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
        String answer4 = scanner.nextLine();
        counter++;

        int score = 0;
        if (answer1.equals("c")){
            score += 5;
        }
        if (answer2.equals("a")){
            score += 5;
        }
        if (answer3.equals("d")){
            score += 5;
        }
        if (answer4.equals("a") || answer4.equals("b")){
            score += 5;
        }
        System.out.println("Your final score is: " + score + " points." );

        if (score >= 15){
            System.out.println("Wow, you know your stuff!");
        } else if (score >= 5 && score < 15){
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time!");
        }

    }
}
