// create a class
public class Customer {
	// data members
		int CustomerId;
		String CustomerName;
		String CustomerGender;
		long PhoneNo;
		String EmailId;
		String Dob;
		String Adress;
		//function members
		//user defined function without return type
		public void setCustomerDetails(int id, String Name, String Gender, long no, String Email, String dob, String address ) {
			 CustomerId = id;
			 CustomerName = Name;
			 CustomerGender = Gender;
			 PhoneNo = no;
			 EmailId = Email;
			 Dob = dob;
			 Adress = address;
		}
		//user defined function with return type
			 public int getId() {
					return CustomerId;
				}
			 //predefined function
public String toString () {
	return CustomerId+","+ CustomerName+","+ CustomerGender+","+PhoneNo+","+EmailId+","+Dob+","+Adress;
}
}
