public class ReturnValues {

//    Do not repetitively copy and paste code
//    Call a function as many times as you need instead

    public static void main(String[] args) {
        double measure1 = measureRectangle(-2.2, 4.3, "area");
        double measure2 = measureRectangle(3.2, 4.1, "perimeter");
//        double measure3 = measureRectangle(3.5, 1.2);
//        double measure4 = measureRectangle(1.6, 5.6);
//        double measure5 = measureRectangle(10.1, 0.7);
//        double measure6 =  measureRectangle(20.2, 5.6);

        stringPrinter(2.2, 4.3, measure1, "area");
        stringPrinter(3.2, 4.1,measure2, "perimeter" );
//        stringPrinter(3.5, 1.2, measure3);
//        stringPrinter(1.6, 5.6, measure4);
//        stringPrinter(10.1, 0.7, measure5);
//        stringPrinter(20.2, 5.6, measure6);

    }
    public static double measureRectangle(double lenght, double width, String option){
        if (lenght < 0 || width < 0){
            System.out.println("length and width cannot be negative");
            System.exit(0);

        }
        switch (option){
            case "area": return  lenght * width;
            case "perimeter": return 2* (lenght + width);
            default: return 404;
        }

//        double area = lenght * width;
//        return area;
    }
    public static void stringPrinter(double lenght, double width, double measure, String option){
        System.out.println("The " + option + " of a rectangle with the length " + lenght + " and width " + width + " is " + measure + "\n");
    }
}
