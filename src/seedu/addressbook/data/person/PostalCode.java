package seedu.addressbook.data.person;

/**
 * Represents address postalCode.
 */

public class PostalCode {
	private final String value;
	
	public PostalCode(String postalCode){
		this.value = postalCode;
	}
	
	public String getValue(){
		return this.value;
	}
}
