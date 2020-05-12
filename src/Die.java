import java.util.Random;

public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int roll(Random random) {
        return random.nextInt(this.sides) + 1;
    }
}