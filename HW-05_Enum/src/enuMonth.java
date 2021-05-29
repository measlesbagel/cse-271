
public enum enuMonth {
	JANUARY		("Jan", "January", 1),
	FEBRUARY		("Feb", "February", 2),
	MARCH		("Mar", "March", 3),
	APRIL		("Apr", "April", 4),
	MAY			("May", "May", 5),
	JUNE		("Jun", "June", 6),
	JULY		("Jul", "July", 7),
	AUGUST		("Aug", "August", 8),
	SEPTEMBER	("Sept", "September", 9),
	OCTOBER		("Oct", "October", 10),
	NOVEMBER	("Nov", "November", 11),
	DECEMBER	("Dec", "December", 12);
	
	//=========================== Properties
	private int monthNum;
	private String shortName, friendlyName;
	
	//=========================== Constructors
	private enuMonth(String shortName, String friendlyName, int monthNum) {
		this.friendlyName = friendlyName;
		this.shortName = shortName;
		this.monthNum = monthNum;
	}
	//=========================== Methods
	@Override
	public String toString() {
		return String.format("%s", getFriendlyName());
	}
	
	//=========================== Getters
	public int getMonthNum() {
		return monthNum;
	}

	public String getShortName() {
		return shortName;
	}

	public String getFriendlyName() {
		return friendlyName;
	}
	
}	
