package entities.ex2;

public class InvalidUsernameException extends RuntimeException {

    public InvalidUsernameException(String message) {
        super(message);
    }
}
