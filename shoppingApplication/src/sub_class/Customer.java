package sub_class;

public class Customer {
	private static int idcount=101;
	private int id;
	private String name;
	private String address;
	private String email;
	private String password;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String address, String email, String password) {
		super();
		this.id = idcount++;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		
	public void displayCustomer() {
		System.out.println("Customer ID: "+this.id
							+"\n Name: "+this.name
							+"\n Address: "+this.address
							+"\n------------------------------------");
	}
			
}
