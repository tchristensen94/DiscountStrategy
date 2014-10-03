package pos;

import javax.swing.*;

/**
 * Output strategy for using jpane to output information
 * @author Timothy
 * @version 0.1
 */
public class OutputJPane implements OutputStrategy {

    /**
     * Outputs the receipt to a JPane
     * @param receipt the receipt to print
     */
    @Override
    public void outputReceipt(String receipt) {
        JOptionPane.showMessageDialog(null, receipt);
    }

    /**
     * Outputs the given message to a JPane
     * @param message the message to show
     */
    @Override
    public void outputMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
