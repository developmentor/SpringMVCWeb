package main.java.com.emine.rest.controllers;

import main.java.com.emine.core.entities.Account;
import main.java.com.emine.core.services.AccountService;
import main.java.com.emine.core.services.exceptions.AccountExistsException;
import main.java.com.emine.rest.resources.AccountResource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/res/accounts")
public class AccountController {

	private AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<AccountResource> createAccount(@RequestBody AccountResource sentAccount) {
		try {
			Account createdAccount = accountService.createAccount(sentAccount);
			
		} catch(AccountExistsException exception){
			
		}
	}
}
