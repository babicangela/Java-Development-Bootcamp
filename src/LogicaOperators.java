public class LogicaOperators {
    public static void main(String[] args) {

        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

//       || OR operator - dok god je jedno poredjenje tacno returns TRUE. Mozemo postavljati vise poredjenja jedno uz drugo. Dok god bar jedno ispunjava uslov vraca TRUE!
//
        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("\nCongratulations, you got the schoolarship!");
        } else {
            System.out.println("\nYou didn't get the schoolarship.");
        }
//         && AND operator - returns true ako je svako poredjenje tacno.
        int credits = 56;
        double GPA =  1.4;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        }else {
            System.out.println("You didn't earn your diploma.");

        }
    }
}
