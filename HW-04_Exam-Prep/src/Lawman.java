import java.util.ArrayList;

public class Lawman extends Person {

	//========================================== Properties
	private boolean isLawman;
	private String lawmanId;
	
	
	//========================================== Constructors
	public Lawman(String firstName, String lastName, int age, String lawmanId, boolean isLawman) {
		super(firstName, lastName, age);
		setIsLawman(isLawman);
		setLawmanId(lawmanId);
	}
	
	
	//========================================== Methods
	public void arrest(Person p, String prisonerId, int sentence, ArrayList<Criminal> criminals) {
		Criminal c = new Criminal(p.getFirstName(), p.getLastName(), p.getAge(), prisonerId, true, sentence);
		criminals.add(c);
	}
	
	@Override
	public String toString() {
		return String.format("Lawman: [%s, %s], %d years old" , getLastName(), getFirstName(), getAge());
	}
	
	
	//========================================== Getters / Setters
	public void setIsLawman(boolean isLawman) {
		this.isLawman = isLawman;
	}	
	
	public boolean getIsLawman() {
		return isLawman;
	}
	
	public void setLawmanId(String lawmanId) {
		this.lawmanId = lawmanId;
	}
	
	public String getLawmanId() {
		return lawmanId;
	}
	
		
}
