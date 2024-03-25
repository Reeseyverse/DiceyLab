
public class Bins {
int[] bins;



public Bins(int mostBins, int leastBins) {
    if (mostBins < leastBins) {
        throw new IllegalArgumentException("Most bins cannot be less than least bins.");
    }
    bins = new int[mostBins - leastBins +1];
}

public void addBins(int value) {
    bins[ value - 2]++;
}

public int getBin(int value) {
    return bins[ value - 2];
}
}
