
public abstract class Person implements iMovable {
	//========================================== Properties
	private String firstName, lastName;
	private int age;
	
	//========================================== Constructors
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		
	}
	
	//========================================== Methods
	@Override
	public void transfer(Transport t, Institution i) {
		
	}
	
	@Override
	public void visit(Transport t, Institution i) {
		
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s], %d years old" , lastName, firstName, age);
	}
	
	//========================================== Getters / Setters
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge()	{
		return age;
	}
}
