package seedu.addressbook.data.person;

/**
 * Represents address block.
 */

public class Block {
	private final String value;
	
	public Block(String block){
		this.value = block;
	}
	
	public String getValue(){
		return this.value;
	}
}
