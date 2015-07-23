import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Daniel Jackson
 */
public class CoinCalculatorTest {

    @Test
    public void zeroChangeMeansYouGetZeroCoins() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$3.00");

        assertEquals(3, coinMessage);
    }

    @Test
    public void oneCentShouldGiveYouOnePenny() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$0.01");

        assertEquals(1, coinMessage);
    }

    @Test
    public void tenCentsShouldGiveYouOneDime() {
        CoinCalculator coinCalculator = new CoinCalculator();

        int coinMessage = coinCalculator.calculateChange("$0.10");

        assertEquals(1, coinMessage);
    }

}
