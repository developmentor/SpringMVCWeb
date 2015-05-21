package main.java.com.emine.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


//Exception oluştuğunda Spring'e kullanıcıya hangi hata durumunu göstereceğini söylüyoruz
@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{
	public BadRequestException() {
		
	}
	
	public BadRequestException(Throwable cause) {
		super(cause);
	}

}
