import Components.*;
import Dice.Dice;
import Player.Player;

import java.util.*;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class SnakeAndLadder {

    private final List<Player> players;
    private Board board;
    private int currentPlayerIndex;
    private Player lastPlayer;
    private Dice dice;
    private Player winner;

    public Player getWinner() {
        return winner;
    }

    public Player getCurrentPlayer(){
       return players.get(currentPlayerIndex);
    }

    public SnakeAndLadder(List<Player> players, Board board){
        this.players = players;
        this.dice = new Dice();
        this.board = board;
        initialize();
    }

    private void initialize() {
        Collections.sort(players);
    }

    public void playNext() throws Exception{
        if(winner != null){
            throw new Exception("Game already over");
        }
        int step = dice.roll();
        Player currentPlayer = getCurrentPlayer();
        int currentPosition = currentPlayer.getCurrentPosition();
        int destination = currentPosition+step;
        destination = (destination <= board.getTotalSize())? destination : currentPosition;
        Hurdle hurdle = board.getHurdle(destination);
        if(hurdle != null){
            destination = hurdle.getDestination(destination);
        }
        currentPlayer.moveForward(destination);
        checkWinner();
        nextPlayer();
    }

    private void checkWinner() {
        Player currentPlayer = getCurrentPlayer();
        if(currentPlayer.getCurrentPosition() == board.getTotalSize()){
            winner = currentPlayer;
        }
    }

    private void nextPlayer() {
        lastPlayer = getCurrentPlayer();
        currentPlayerIndex = (currentPlayerIndex+1)%(players.size());
    }

    public int getLastDiceOutput(){
        return dice.getOutput();
    }

    public Player getLastPlayer(){
        return lastPlayer;
    }

    public void reset(){
        currentPlayerIndex = 0;
        lastPlayer = null;
        winner = null;
        for(Player player : players){
            player.resetPosition();
        }
    }

    public Board getBoard(){
        return board;
    }

}
