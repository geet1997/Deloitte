package exceptiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	
	public static void main(String[] args) {
		
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"Revi","Pune",5461);
		
		allCustomers.add(customer1);
		allCustomers.add(new Customer(2,"Rohanne","NY",3000));
		allCustomers.add(new Customer(3,"Rohe","NYfa",64614));
		
		Iterator<Customer> customerIterator1 = allCustomers.iterator();
		

		while(customerIterator1.hasNext()) {
			Customer customer = customerIterator1.next();
			System.out.println("Before sorting");
			System.out.println(customer);
	}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		 
		
		
		//sorting
		if (choice==1) {
			Collections.sort(allCustomers, new NameComparator());
			
				System.out.println(allCustomers);
		}
		
		if (choice==2) {
			Collections.sort(allCustomers,new AddressComparator());
				System.out.println(allCustomers);
		}
		 
		if (choice==3) {
			Collections.sort(allCustomers);
			System.out.println("After sorting on Bill Amount");
				System.out.println(allCustomers);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
