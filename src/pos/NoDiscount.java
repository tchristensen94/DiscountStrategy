/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author Timothy
 * @version 0.01
 */
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscountPrice(double cost) {
        return cost;
    }
    
}
