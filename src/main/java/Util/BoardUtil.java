package Util;

import Components.Hurdle;
import Components.HurdleType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class BoardUtil {

    public static Map<Integer, Hurdle> getHurdleType100(){
        Map<Integer, Hurdle> hurdleMap = new HashMap<Integer, Hurdle>();
        hurdleMap.put(5, new Hurdle(HurdleType.LADDER, 5, 21));
        hurdleMap.put(23, new Hurdle(HurdleType.LADDER, 23, 41));
        hurdleMap.put(77, new Hurdle(HurdleType.LADDER, 77, 9));
        hurdleMap.put(91, new Hurdle(HurdleType.LADDER, 91, 60));
        return hurdleMap;
    }

    public static Map<Integer, Hurdle> getHurdleMap(Map<Integer, Integer> snakeMap, Map<Integer, Integer> ladderMap){
        Map<Integer, Hurdle> hurdleMap = new HashMap<Integer, Hurdle>();
        for(Integer key : snakeMap.keySet()){
            hurdleMap.put(key, new Hurdle(HurdleType.SNAKE, key , snakeMap.get(key)));
        }
        for(Integer key : ladderMap.keySet()){
            hurdleMap.put(key, new Hurdle(HurdleType.LADDER, key , ladderMap.get(key)));
        }
        return hurdleMap;
    }
}
