package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, unit 321, 12345";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses has a format of BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+, .+, .+, .+";

    private boolean isPrivate;
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;
    
    private final String addrSplit = ", ";
    private final int blockInd = 0;
    private final int streetInd = 1;
    private final int unitInd = 2;
    private final int postalInd = 3;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String [] addrPart = address.split(addrSplit);
        this.block = new Block(addrPart[blockInd]);
        this.street = new Street(addrPart[streetInd]);
        this.unit = new Unit(addrPart[unitInd]);
        this.postalCode = new PostalCode(addrPart[postalInd]);
    }
    
    public String getValue(){
    	return block.getValue()+addrSplit
    			+ street.getValue()+addrSplit
    			+ unit.getValue()+addrSplit
    			+ postalCode.getValue();
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return this.getValue();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.getValue().equals(((Address) other).getValue())); // state check
    }

    @Override
    public int hashCode() {
        return this.getValue().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}