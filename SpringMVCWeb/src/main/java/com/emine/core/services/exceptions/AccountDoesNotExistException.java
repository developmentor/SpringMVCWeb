package main.java.com.emine.core.services.exceptions;


//Service katmanları tarafından fırlatılacak olan exception'lar tanımlanmıştır.
public class AccountDoesNotExistException extends RuntimeException{

	public AccountDoesNotExistException(Throwable cause) {
		super(cause);
	}
	
	public AccountDoesNotExistException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public AccountDoesNotExistException(String message) {
		super(message);
	}
	
	public AccountDoesNotExistException() {
		
	}
}
