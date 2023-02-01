package day30exceptioninterface;

public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String message){

        super(message);
    }
}
