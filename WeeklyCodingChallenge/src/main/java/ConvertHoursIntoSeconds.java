public class ConvertHoursIntoSeconds {

    public static int hoursToSeconds(int hours){
        return hours * 60 * 60;
    }

    public static void main(String[] args){
        System.out.println(hoursToSeconds(2) == 7200);
        System.out.println(hoursToSeconds(10) == 36000);
        System.out.println(hoursToSeconds(24) == 86400);
    }
}
