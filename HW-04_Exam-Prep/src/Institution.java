import java.util.ArrayList;

public class Institution implements iHostPeople {

	//========================================== Properties
	private ArrayList<Person> inInstitution = new ArrayList<>();
	private String institutionName, institutionId;
	
	//========================================== Constructors
	public Institution(String institutionName, String institutionId, ArrayList<Person> inInstitution) {
		setInstitutionName(institutionName);
		setInstitutionId(institutionId);
		setInInstitution(inInstitution);
	}
	
	public Institution(String institutionName, String institutionId) {
		setInstitutionName(institutionName);
		setInstitutionId(institutionId);

	}
	
	//========================================== Methods
	@Override
	public void add(Person p) {
		inInstitution.add(p);
	}

	@Override
	public void remove(Person p) {
		inInstitution.remove(p);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Institution ID: " + institutionId + "\n");
		sb.append("Institution Name: " + institutionName + "\n");
		sb.append("Institution Prisoners: \n");
		for(Person p : getInInstitution()) {
			sb.append("\t" + p);
		}
		
		return sb.toString();
	}

		
	//========================================== Getters / Setters
	
	public ArrayList<Person> getInInstitution() {
		return inInstitution;
	}

	public void setInInstitution(ArrayList<Person> inInstitution) {
		this.inInstitution = inInstitution;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}


}
