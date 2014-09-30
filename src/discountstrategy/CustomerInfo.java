package discountstrategy;

/**
 * Created by Timothy on 9/30/2014.
 */
public class CustomerInfo {

    private String customerName;
    private String customerID;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public CustomerInfo(String customerName, String customerID) {
        setCustomerName(customerName);
        setCustomerID(customerID);
    }
}
