package main.java.com.emine.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.CONFLICT)
public class ConflictException extends RuntimeException{

	public ConflictException(Throwable cause) {
		super(cause);
	}
}
