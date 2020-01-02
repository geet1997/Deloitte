package exceptiondemos;

public class Customer implements Comparable<Customer> {
 private int customerId;
 private String customerName;
 private String customerAddress;
 private int billAmount;
 public Customer() {
	 
 }
public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerAddress = customerAddress;
	this.billAmount = billAmount;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}
@Override
public String toString() {
	return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
			+ customerAddress + ", billAmount=" + billAmount + "]";
}
@Override
public int compareTo(Customer c) {
	if(billAmount > c.getBillAmount())
		return -1;
	else 
	return 0;
}
 
}
