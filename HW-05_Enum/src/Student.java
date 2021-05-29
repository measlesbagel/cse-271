import java.util.Scanner;

public class Student {
	//=========================== Properties
	private int id, birthYear, birthDay;
	private String name;
	private enuMonth birthMonth;

	//=========================== Constructors
	public Student(Scanner fin) {
		this(fin.nextLine());
	}

	public Student(String data) {
		this(data.split("\t"));
	}

	public Student(String[] parts) {
		this(	Integer.parseInt(parts[0]), 
				parts[1], 
				enuMonth.valueOf(parts[2]), 
				Integer.parseInt(parts[3]), 
				Integer.parseInt(parts[4]));
	}

	public Student(int id, String name, enuMonth birthMonth, int birthYear, int birthDay) {
		setId(id);
		setName(name);
		setBirthMonth(birthMonth);
		setBirthYear(birthYear);
		setBirthDay(birthDay);
	}

	public Student(Student s) {
		this(	s.getId(), 
				s.getName(), 
				s.getBirthMonth(), 
				s.getBirthYear(), 
				s.getBirthDay());
	}

	//=========================== Methods
	public Student clone() {
		return new Student(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student s = (Student)obj;
		
		return s.id == id && 
				s.name.equals(name) && 
				s.birthMonth.equals(birthMonth) && 
				s.birthYear == birthYear && 
				s.birthDay == birthDay;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Student ID: " + id + "\n");
		sb.append("Student Name: " + name + "\n");
		sb.append("Student Birthdate: " + birthMonth.getFriendlyName() + " " + birthDay + ", " + birthYear);
		
		return sb.toString();
	}

	//=========================== Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public enuMonth getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(enuMonth birthMonth) {
		this.birthMonth = birthMonth;
	}


}
