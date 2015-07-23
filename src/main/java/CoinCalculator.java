/**
 * Daniel Jackson
 */
public class CoinCalculator {


    public static int calculateChange(String amountOfChange) {
        int change = (int) (Double.parseDouble(amountOfChange.substring(1)) * 100.0);
        int ccount = 0;
        int[] coinvals = null;
        int[] uscoins = {100, 25, 10, 5, 1};
        int[] eucoins = {200, 100, 50, 20, 10, 5, 1};
        if (amountOfChange.charAt(0) == '$') {
            coinvals = uscoins;
        } else if (amountOfChange.charAt(0) == '€') {
            coinvals = eucoins;
        } else {
            return -1;
        }
        for (int val : coinvals) {
            if (change >= val) {
                ccount += change/val;
                change = change%val;
            }
        }
        return ccount;
    }
}
