public class Simulation {

    private int numOfDice;
    private int numOfTosses;
    private Bins results;
    public Simulation(int numOfDice, int numOfTosses) {
        this.numOfDice = numOfDice;
        this.numOfTosses = numOfTosses;
        this.results = new Bins(numOfDice * 6, numOfDice * 2);
    }


    public  void run() {
        Dice dice = new Dice(numOfDice);
        for (int i =0; i < numOfTosses; i++) {
            int toss = dice.total();
            results.addBins(toss);
        }
    }

    // Dice result
    public  void getResults() {
        System.out.println(numOfDice + "dice was tossed for " + numOfTosses + "times.");
        for (int i = numOfDice * 2; i <= numOfDice * 6; i++) {
            int count = results.getBin(i);
            double percent = (double) count / numOfTosses * 100;
            String stars = "*".repeat((int) percent);
            System.out.printf("%2d : %8d: %.2f %s\n", i, count, percent, stars);
        }

    }


        public static void main(String[] args) {
            Simulation sim = new Simulation(2, 1000000);
            sim.run();
            sim.getResults();
        }
    }

