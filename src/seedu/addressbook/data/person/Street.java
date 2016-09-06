package seedu.addressbook.data.person;

/**
 * Represents address street.
 */

public class Street {
	private final String value;
	
	public Street(String street){
		this.value = street;
	}
	
	public String getValue(){
		return this.value;
	}
}
