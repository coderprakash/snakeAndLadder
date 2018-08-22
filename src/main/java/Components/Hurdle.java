package Components;

/**
 * Created by prakashagrawal on 22/08/18.
 */
public class Hurdle {

    HurdleType type;
    int startPoint;
    int endPoint;

    public Hurdle(HurdleType type, int startPoint, int endPoint){
        this.type = type;
        this.endPoint = endPoint;
        this.startPoint = startPoint;
    }

    public int getDestination(int startPoint){
        return this.endPoint;
    }
}
