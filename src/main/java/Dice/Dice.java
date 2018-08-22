package Dice;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class Dice {

    private int lastOutput;

    public int roll(){
        int result = (int) (Math.random()*6)+1;
        this.lastOutput = result;
        return result;
    }

    public int getOutput() {
        return lastOutput;
    }
}
