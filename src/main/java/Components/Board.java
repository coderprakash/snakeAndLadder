package Components;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class Board {
    private int rows;
    private int cols;
    private int totalSize;
    private Map<Integer, Hurdle> hurdleMap = new HashMap<Integer, Hurdle>();


    public Board(int rows, int cols, Map<Integer, Hurdle> hurdleMap){
        this.rows = rows;
        this.cols = cols;
        this.totalSize = rows*cols;
        this.hurdleMap = hurdleMap;
    }

    public Hurdle getHurdle(int key){
        return hurdleMap.get(key);
    }

    public int getTotalSize(){
        return this.totalSize;
    }

    public int getRows(){
        return this.rows;
    }

    public int getCols(){
        return this.cols;
    }
}
