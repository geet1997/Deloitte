package com.cms.deloitte.client;

import java.util.Scanner;

import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {
	public static void startCustomerApp() {
		System.out.println("### Welcome to Customer ### ");
		System.out.println("### 1. Add Customer ### ");
		System.out.println("### 2. Update Customer ### ");
		System.out.println("### 3. Delete Customer ### ");
		System.out.println("### 4.  ### ");
		System.out.println("### 6.E X I T ### ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice!");
		int choice = sc.nextInt();

		if (choice == 1) {
			Customer customer = new Customer();
			customer.acceptCustomerDetails();
			CustomerDAOImpl impl = new CustomerDAOImpl();
			boolean result = impl.addCustomer(customer);
			System.out.println(result);
		}
		if (choice == 2) {

		}
		if (choice == 3) {

		}
		if (choice == 4) {

		}
		if (choice == 5) {

		}
		if (choice == 6) {
			System.out.println("");
		}
	}
}
