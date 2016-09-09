package seedu.addressbook.data.person;

/* Use Contact to inheritance phone, email, address */

public class Contact {
	private final String value;
	private boolean isPrivate;
	
	public Contact(String value, boolean isPrivate){
		this.value = value;
		this.setPrivate(isPrivate);
	}
		
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
