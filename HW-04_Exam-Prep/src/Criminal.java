import java.util.ArrayList;

public class Criminal extends Person {
	
	//========================================== Properties
	private boolean isCriminal;
	private String prisonerId;
	private int sentence;
	
	
	//========================================== Constructors
	public Criminal(String firstName, String lastName, int age, String prisonerId, boolean isCriminal, int sentence) {
		super(firstName, lastName, age);
		setIsCriminal(isCriminal);
		setPrisonerId(prisonerId);
		setSentence(sentence);
	}
	
	
	//========================================== Methods
	public void release(Criminal c, ArrayList<Criminal> criminals) {
		c.setSentence(0);
		c.setIsCriminal(false);
		criminals.remove(c);
	}
	
	@Override
	public String toString() {
		return String.format("Criminal: [%s, %s], %d years old" , getLastName(), getFirstName(), getAge());
	}
	
	
	//========================================== Getters / Setters
	public void setIsCriminal(boolean isCriminal) {
		this.isCriminal = isCriminal;
	}	
	
	public boolean getIsCriminal() {
		return isCriminal;
	}
	
	public void setPrisonerId(String prisonerId) {
		this.prisonerId = prisonerId;
	}
	
	public String getPrisonerId() {
		return prisonerId;
	}
	
	public void setSentence(int sentence) {
		this.sentence = sentence;
	}
	
	public int getSentence() {
		return sentence;
	}
	
}
