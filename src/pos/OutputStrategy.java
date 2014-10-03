package pos;

/**
 * An interface for creating outputs to be used with the receipt class
 * @author Tim
 * @version 0.1
 */
public interface OutputStrategy {

    public abstract void outputReceipt(String receipt);
    public abstract void outputMessage(String message);
}
