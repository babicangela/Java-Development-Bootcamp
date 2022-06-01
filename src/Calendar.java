public class Calendar {
    public static void main(String[] args) {
        String day = "Friday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");

        //Check calendar here:
        switch (day){
        //  "Monday": print ("Sorry, I have to stay at work late.");
            case "Monday": System.out.println("Sorry, I have to stay at work late."); break;
        //  "Tuesday": print ("It looks like I have meetings all day.");
            case "Tuesday": System.out.println("It looks like I have meetings all day."); break;
        //  "Wednesday": print ("I have a dentist appointment. Some other time!");
            case "Wednesday": System.out.println("I have a dentist appointment. Some other time!"); break;
        //  "Thursday": print ("Sorry, thursday is date night!");
            case "Thursday": System.out.println("Sorry, thursday is date night!"); break;
        //  "Friday": print ("I'm free!!");
            case "Friday": System.out.println("I'm free!!"); break;
        //  "Saturday": print ("I'm free!!");
            case "Saturday": System.out.println("I'm free!!"); break;
        //  "Sunday": print ("I'm free!!");
            case "Sunday": System.out.println("I'm free!!"); break;
        //  "otherwise": print ("that's not a day.");
            default:
                System.out.println("That's not a day."); break;
        }




    }
}