import Components.Board;
import Player.Player;
import Util.BoardUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class Main {


    public static void main(String[] args) throws Exception {

        List<Player> players = new ArrayList<Player>();
        Player player1 = new Player("Prakash");
        Player player2 = new Player("Mohan");
        Player player3 = new Player("Ram");
        Player player4 = new Player("Hari");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        Board board = new Board(10,10, BoardUtil.getHurdleType100());
        SnakeAndLadder game = new SnakeAndLadder(players, board);
        while(game.getWinner() == null){
            game.playNext();
            System.out.println("currentPlayer - "+ game.getLastPlayer().getName());
            System.out.println("Dice output - " + game.getLastDiceOutput());
            System.out.println("Lastposition - "+ game.getLastPlayer().getLastPosition());
            System.out.println("currentPosition - "+ game.getLastPlayer().getCurrentPosition());
        }
        System.out.println("winner is - " + game.getWinner().getName());

        game.reset();

        while(game.getWinner() == null){
            game.playNext();
            System.out.println("currentPlayer - "+ game.getLastPlayer().getName());
            System.out.println("Dice output - " + game.getLastDiceOutput());
            System.out.println("Lastposition - "+ game.getLastPlayer().getLastPosition());
            System.out.println("currentPosition - "+ game.getLastPlayer().getCurrentPosition());
        }
        System.out.println("winner is - " + game.getWinner().getName());


    }
}
