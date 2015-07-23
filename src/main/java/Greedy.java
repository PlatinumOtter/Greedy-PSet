import java.util.Scanner;

/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:05 AM
 */
public class Greedy {


    public static void main(String[] varArgs) {
        Scanner sc = new Scanner(System.in);
        String input;
        CoinCalculator cc = new CoinCalculator();
        System.out.println("Welcome to Greedy Coin Calculator!\n");
        do {
            System.out.print("Please input change desired ($X.XX or €X.XX or 0 to exit): ");
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("0")) {
                System.out.println(String.valueOf(cc.calculateChange(input)) + " coins.");
            }
        } while (!input.equalsIgnoreCase("0"));
        sc.close();
        System.out.println("\nThank you for using Greedy Coin Calculator!");
    }

}
