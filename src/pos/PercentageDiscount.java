package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class PercentageDiscount implements DiscountStrategy {

    private double percentage;

    public PercentageDiscount() {
        setPercentage(0.10);
    }

    public PercentageDiscount(double percentage) {
        setPercentage(percentage);
    }

    @Override
    public double getDiscountPrice(double cost) {
        return cost - (cost * this.percentage);
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public double getPercentage() {
        return percentage;
    }
}
