public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;

        double toyCar = 5.99;
        System.out.println("Can I get this car?");

        //if you have enough money
        if ( wallet>= toyCar) {
            //       print: Sure!
            System.out.println("Sure!");
            //       pay for the toy car
            wallet -= toyCar;
            //else:  Sorry, I only have <wallet> left.
        }else {
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }
        System.out.println("After this shopping I have $" + wallet + " left in my wallet.");


        double nike = 89.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
        if (wallet >= nike){
            //       print: Sure!
            System.out.println("Sure!");
            //       pay for the nike shoes
            wallet -= nike;
        } else {
            //else: Sorry, I only have <wallet> left.
            System.out.println("Sorry, I only have $" + wallet + " left.");
        }
        System.out.println("Total amount of money lef in my wallet is $" + (int)wallet + ".");
    }
    }
