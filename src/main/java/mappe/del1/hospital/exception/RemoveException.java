package mappe.del1.hospital.exception;

public class RemoveException extends Exception{
    private String personNotFound;

    RemoveException(String message){
        super(message);

    }

}
