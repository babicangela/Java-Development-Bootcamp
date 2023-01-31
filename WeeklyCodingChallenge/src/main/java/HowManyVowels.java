public class HowManyVowels {

    public static int countVowels(String str) {

        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    public static void main(String[] args) {
        System.out.println("Celebration: " + countVowels("Celebration"));
        System.out.println("Palm: " + countVowels("Palm"));
        System.out.println("Prediction: " + countVowels("Prediction"));
    }
}

