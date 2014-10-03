package pos;

/**
 * Created by Timothy on 10/3/2014.
 */
public interface OutputStrategy {

    public abstract void outputReceipt(String receipt);
    public abstract void outputMessage(String message);
}
