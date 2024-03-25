
import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void testBinsInitialization() {
        int mostBins = 10;
        int leastBins = 5;
        Bins bins = new Bins(mostBins, leastBins);
        Assert.assertNotNull(bins);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBinsInitializationWithInvalidArguments() {
        int mostBins = 5;
        int leastBins = 10;
        Bins bins = new Bins(mostBins, leastBins);
    }

    @Test
    public void testAddBins() {
        int mostBins = 10;
        int leastBins = 5;
        Bins bins = new Bins(mostBins, leastBins);
        int value = 7;
        bins.addBins(value);
        Assert.assertEquals(1, bins.getBin(value));
    }

    @Test
    public void testAddBinsMultipleTimes() {
        int mostBins = 10;
        int leastBins = 5;
        Bins bins = new Bins(mostBins, leastBins);
        int value = 7;
        int timesToAdd = 3;
        for (int i = 0; i < timesToAdd; i++) {
            bins.addBins(value);
        }
        Assert.assertEquals(timesToAdd, bins.getBin(value));
    }

    @Test
    public void testGetBinForNonExistentValue() {
        int mostBins = 10;
        int leastBins = 5;
        Bins bins = new Bins(mostBins, leastBins);
        int value = 7;
        int binCount = bins.getBin(value);
        Assert.assertEquals(0, binCount);
    }
}
