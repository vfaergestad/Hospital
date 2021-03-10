package mappe.del1.hospital.exception;

/**
 * Exception for Department.remove().
 * @author Vegard Færgestad
 */

public class RemoveException extends Exception{

    private static final Long serialVersionUID = 1L;

    /**
     * Constructor for class RemoveException.
     * @param message Exception message.
     */
    public RemoveException(String message){
        super(message);
    }

}
