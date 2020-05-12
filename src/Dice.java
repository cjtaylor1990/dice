import java.util.Random;

public class Dice {
    private Die[] dice;

    public Dice(int sides, int number) {
        this.dice = new Die[number];
        for (int i = 0; i < number; i++) {
            dice[i] = new Die(sides);
        }
    }

    public int getNumber() {
        return this.dice.length;
    }

    public int getSides() {
        return this.dice[0].getSides();
    }

    public String roll(Random random) {
        String rollResult = "";
        int rollTotal = 0;
        int currentResult;
        for (Die die : this.dice) {
            currentResult = die.roll(random);
            rollTotal += currentResult;
            rollResult = new String(rollResult + " " + currentResult);
        }
        return new String(rollResult + " (total: " + rollTotal + ")");
    }
}