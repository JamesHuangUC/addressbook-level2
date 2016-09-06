package seedu.addressbook.data.person;

/**
 * Represents address unit.
 */

public class Unit {
	private final String value;
	
	public Unit(String unit){
		this.value = unit;
	}
	
	public String getValue(){
		return this.value;
	}
}
