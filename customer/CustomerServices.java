import java.util.Scanner;

public class CustomerServices {
	//user defined data type
		Customer customerList[] = new Customer[3];
		int index = 0;
		int customerId = 1001;
		Scanner obj = new Scanner(System.in);
		
		public void addNewCustomer() {
			if( index < 3) {
				System.out.println("Enter Customer Name ");
				String name = obj.next();
				System.out.println("Enter Customer Gender ");
				String gender = obj.next();
				System.out.println("Enter Customer Phone No ");
				long no = obj.nextLong();
				System.out.println("Enter Customer Email ");
				String email = obj.next();
				System.out.println("Enter Customer Dob ");
				String dob = obj.next();
				System.out.println("Enter Customer Adress ");
				String adress = obj.next();
				Customer c = new Customer();
				c.setCustomerDetails(customerId,name,gender,no,email,dob,adress);
				customerList[index] = c;
				index = index + 1;
				customerId = customerId + 1;
				System.out.println("Customer details got added successfully");
			}
			else {
				System.out.println("Sorry!.. Customers got filled.");
				System.out.println("Better Luck Next time.....(..)");
			}
}
		public void editCustomer() {
			if(index != 0) {
				System.out.println();
				System.out.println("Enter the CustomerId to Edit the details: ");
				customerId = obj.nextInt();
				for(int i=0;i<index;i++) {
					if(customerList[i].getId() == customerId) {
						System.out.println("Enter Customer Name: ");
						String name = obj.next();
						System.out.println("Enter your Gender: ");
						String gender = obj.next();
						System.out.println("Enter your Email-id: ");
						String email = obj.next();
						System.out.println("Enter your Phone Number: ");
						long no = obj.nextLong();
						System.out.println("Enter your Date of Birth: ");
						String dob = obj.next();
						System.out.println("Enter your Address: ");
						String adress = obj.next();
						Customer c = new Customer();
						c.setCustomerDetails(customerId, name, gender, no, email, dob, adress);
						customerList[i] = c;
						System.out.println("---------------------------------------------");
						System.out.println("Customer with Id "+customerId+" updated Successfully");
						System.out.println("---------------------------------------------");
					}
				}
			}
			else {
				System.out.println("---------------------------------------------");
				System.out.println("There are no customers till now.");
				System.out.println("---------------------------------------------");
			}
		}
		
		public void deleteCustomer() {
			if(index != 0) {
				System.out.println();
				System.out.println("Enter the CustomerId to delete the Customer Application: ");
				customerId = obj.nextInt();
				for(int i=0;i<index;i++) {
			      	if(customerList[i].getId() == customerId) {
			    	  for(int j=i;j<index-1;j++) {
			        	customerList[j] = customerList[j+1];
			        	}
			        	customerList[index-1] = null;
			        	index--;
			        	System.out.println("---------------------------------------------");
			        	System.out.println("Customer with Id "+customerId+" deleted Successfully");
			        	System.out.println("---------------------------------------------");
			      	}
				}
			}
			else {
				System.out.println("---------------------------------------------");
				System.out.println("There are no customers till now.");
				System.out.println("---------------------------------------------");
			}
		}
		
		public void diplayAllCustomers() {
			if(index == 0) {
				System.out.println("---------------------------------------------");
				System.out.println("There are no customers till now.");
				System.out.println("---------------------------------------------");
			}
			else {
				for(int i=0;i<index;i++) {
					Customer c = customerList[i];
					System.out.println(c);
				}
			}
		}
		
		public void displayCustomerById() {
			if(index != 0) {
				System.out.println();
				System.out.println("Enter the CustomerId to display the Particular Customer details: ");
				customerId = obj.nextInt();
				for(int i=0;i<index;i++) {
					if(customerList[i].getId() == customerId) {
						System.out.println(customerList[i]);
					}
					
				}
			}
			else{
				System.out.println("---------------------------------------------");
				System.out.println("There are no customers till now.");
				System.out.println("---------------------------------------------");
			}
		}
				
	public void menu() {
		CustomerServices service = new CustomerServices();
		while(true) {
			System.out.println("=============Welcome to DETAILS=========");
			System.out.println("Press 1 for Add New CUSTOMER");
			System.out.println("Press 2 for Display All Available CUSTOMERs");
			System.out.println("Press 6 for Edit Customer Details.");
			System.out.println("Press 3 for Delete entire customer from Database.");
			System.out.println("Press 4 for Display a particular Customer Details.");
			System.out.println("Press 5 for Exit");
			System.out.println("Please Choose your Choice..");
			int choice = obj.nextInt();
			switch(choice) {
			case 1 : service.addNewCustomer(); break;
			case 2 : service.diplayAllCustomers();break;
			case 6 : service.editCustomer();break; 
			case 4 : service.displayCustomerById();break;
			case 3 : service.deleteCustomer();break;
			case 5 : System.exit(choice);
			default:System.out.println("Press Enter to go to the previous menu..");
					obj.next();
			}
		}
	}
}