import java.util.ArrayList;

public class Transport implements iHostPeople, iMovable {

	//========================================== Properties
	private ArrayList<Person> onTransport = new ArrayList<>();
	private String transportName, transportId;
	
	//========================================== Constructors
	public Transport(String transportName, String transportId, ArrayList<Person> onTransport) {
		setTransportName(transportName);
		setTransportId(transportId);
		setOnTransport(onTransport);
		
	}
	
	public Transport(String transportName, String transportId) {
		setTransportName(transportName);
		setTransportId(transportId);
		
	}
		
	//========================================== Methods
			
	@Override
	public void add(Person p) {
		onTransport.add(p);
	}

	@Override
	public void remove(Person p) {
		onTransport.remove(p);
	}
		
	@Override
	public void transfer(Transport t, Institution i) {
		for(Person p : t.getOnTransport()) {
			i.getInInstitution().add(p);
			t.getOnTransport().remove(p);
		}
	}
	
	@Override
	public void visit(Transport t, Institution i) {

	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Transport ID: " + transportId + "\n");
		sb.append("Transport Name: " + transportName + "\n");
		sb.append("Transport Passengers: \n");
		for(Person p : getOnTransport()) {
			sb.append("\t" + p);
		}
		
		return sb.toString();
	}
	
	//========================================== Getters / Setters
			
	public String getTransportName() {
		return transportName;
	}


	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}


	public String getTransportId() {
		return transportId;
	}


	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}


	public ArrayList<Person> getOnTransport() {
		return onTransport;
	}


	public void setOnTransport(ArrayList<Person> onTransport) {
		this.onTransport = onTransport;
	}
	

	

}
