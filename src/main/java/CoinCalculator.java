/**
 * User: mpmenne
 * Date: 6/18/14
 * Time: 3:06 AM
 */
public class CoinCalculator {


    public int calculateChange(String amountOfChange) {
        int change = (int) (Double.parseDouble(amountOfChange.substring(1)) * 100.0);
        int ccount = 0;
        int[] coinvals = {100, 25, 10, 5, 1};
        for (int val : coinvals) {
            if (change >= val) {
                ccount += change/val;
                change = change%val;
            }
        }
        return ccount;
    }
}
