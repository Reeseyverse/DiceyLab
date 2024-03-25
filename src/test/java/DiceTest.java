import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class DiceTest {

    @Test
    public void testInitialization() {
        // Test initialization with different numbers of dice
        Dice dice1 = new Dice(1);
        Assert.assertEquals(1, dice1.dices);

        Dice dice2 = new Dice(2);
        Assert.assertEquals(2, dice2.dices);

        Dice dice5 = new Dice(5);
        Assert.assertEquals(5, dice5.dices);
    }

    @Test
    public void testTotal() {
        Random random = new Random() {
            @Override
            public int nextInt(int bound) {
                return 0;
            }
        };


        Dice dice1 = new Dice(1);
        dice1.diceRoll = random;
        Assert.assertEquals(1, dice1.total());

        Dice dice2 = new Dice(2);
        dice2.diceRoll = random;
        Assert.assertEquals(2, dice2.total());

        Dice dice5 = new Dice(5);
        dice5.diceRoll = random;
        Assert.assertEquals(5, dice5.total());
    }
}
