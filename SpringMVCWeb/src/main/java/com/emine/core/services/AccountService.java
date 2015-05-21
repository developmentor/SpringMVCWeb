package main.java.com.emine.core.services;

import main.java.com.emine.core.entities.Account;
import main.java.com.emine.core.entities.Blog;

public interface AccountService {
	public Account findAccount(Long id);
	public Account createAccount(Account data);
	public Blog createBlog(Long accountId, Blog data);

}
