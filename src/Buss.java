public class Buss {
    public static void main(String[] args) {
        int passangers = 0;
//        + operator ispred =
        passangers += 9;
        System.out.println(passangers);
//        - operator isped =
        passangers -= 5;
        System.out.println(passangers);
//        Moze ovako takodje ali mnogo je lepse i cistije da kod bude ispisan sa -+ operatorom ispred =
        passangers = passangers - 4;
        System.out.println(passangers);

    }
}
