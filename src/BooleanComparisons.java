public class BooleanComparisons {
    public static void main(String[] args) {

        int chemistyGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(chemistyGrade >= englishGrade);
        System.out.println(biologyGrade >= englishGrade);
        System.out.println(englishGrade <= chemistyGrade);
//        Nikad ne koristiti != i == za strings tipove podataka vec String.equals(String)
        System.out.println(chemistyGrade != englishGrade);

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(!sentence.equals(sentence2));






//        double sales = 37.55;
//        double costs = 5.55;
//
//        System.out.println(sales>costs);




    }
}
