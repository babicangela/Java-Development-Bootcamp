public class Championship {
    public static void main(String[] args) {

        int gryffindor = 500;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        int margin = gryffindor - ravenclaw;


        //if gryffindor wins by a margin of 300 points:
        if (margin >= 300){
        //print: Gryffindor takes the house cup!
            System.out.println("\nGryffindor takes the house cup!");}

        //if gryffindor wins by a margin of any points:
        else if (margin <= 0){
            //print: In second place, Gryffindor!
            System.out.println("\nIn second place, Gryffindor");
        }


        //if gryffindor loses by a margin of 100 points, they are third:
        else if (margin <= -100) {
            //print: In third place, Gryffindor!
            System.out.println("\nIn third place, Gryffindor.");
        } else {
        //else:
        //print: In fourth place, Gryffindor!
            System.out.println("\nIn fourth place, Gryffindor");
    }
}}

//public class Championship {
//    public static void main(String[] args) {
//
//        int gryffindor = 100;    //gryffindor points
//        int ravenclaw = 500;    //ravenclaw points
//
//        int pointsMargin = gryffindor-ravenclaw;
//
//        if (pointsMargin >= 300) {
//            System.out.println("Gryffindor are the champions");
//        } else if (pointsMargin >= 0) {
//            System.out.println("Gryffindor is in second place");
//        } else if (pointsMargin >= -100) {
//            System.out.println("Gryffindor is in third place");
//        } else {
//            System.out.println("Gryffindor is in fourth place");
//        }
//    }
//}