import java.util.Random;


public class Dice {
 public int dices;

public Random diceRoll;


public Dice(int dices) {
this.dices = dices;
this.diceRoll = diceRoll;
}

public int total(){
    int sum =0;
    for (int i = 0; i < dices; i++) {
        sum += diceRoll.nextInt(6) +1;
    }
    return sum;

}




}
