package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class FlatDiscount implements DiscountStrategy {

    private double discount;

    public FlatDiscount() {
        setFlatDiscount(25);
    }

    public FlatDiscount(double discount) {
        setFlatDiscount(discount);
    }



    @Override
    public double getDiscountPrice(double cost) {
        return cost - discount;
    }


    public void setFlatDiscount(double discount) {
        this.discount = discount;
    }

    public double getFlatDiscount() {
        return discount;
    }
}
