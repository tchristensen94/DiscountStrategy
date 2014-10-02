package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class QuantityDiscount implements DiscountStrategy {

    private int qty;
    private double percent;
    
    public QuantityDiscount(int qty, double percent) {
        
    }
    
    @Override
    public double getDiscountPrice(double cost) {
        return 0;
    }
}
