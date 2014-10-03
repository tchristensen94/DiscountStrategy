package pos;

/**
 * Created by Timothy on 9/30/2014.
 */
public class Customer {

    private String customerName;
    private String customerID;

    public Customer(String customerName, String customerID) {
        setCustomerName(customerName);
        setCustomerID(customerID);
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        this.customerID = customerID;
    }


}
