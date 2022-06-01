public class Biography {
    public static void main(String[] args) {
        //make a name variable
        String name = "Andjela";
        //make an age variable
        int age = 34;
        //make a country variable
        String country = "Serbia";
        //make a sport variable
        String sport = "Voleyball";
        //make an hours variable
        int hours = 1;
        //make a game variable
        String game = "Picado";
        //make a subject variable
        String subject = "math";
        //make a grade variable
         double grade = 3.8;


        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
        System.out.println("My favourite sport is " + sport +". I play for " + hours + " hour a day.");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + ", I scored a " + grade + ".");

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: "  + (5 % 2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println("I count: " + counter);
        counter--;
        counter--;
        counter--;
        System.out.println("I count: " + counter);
        counter += 1;
        System.out.println("I count: " + counter);


    }
}
