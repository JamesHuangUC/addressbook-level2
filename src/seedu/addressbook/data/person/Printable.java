package seedu.addressbook.data.person;

/**
 * 
 * Add a Printable interface as Interface-Segregation Principle 
 * and implement Name, Phone, Email, Address
 *
 */

public interface Printable{
	String getPrintableString();
}