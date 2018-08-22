package Player;

import java.util.Comparator;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class Player implements Comparable<Player> {



    private String name;
    private int currentPosition;
    private int lastPosition;


    public Player(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }


    public int getLastPosition() {
        return lastPosition;
    }


    public int compareTo(Player p) {
        return this.getName().compareTo(p.getName());
    }


    public void moveForward(int destination){
        this.lastPosition = this.currentPosition;
        this.currentPosition = destination;
    }

    public void resetPosition() {
        this.currentPosition = 0;
        this.lastPosition = 0;
    }
}
