package main.java.com.emine.core.services;

import main.java.com.emine.core.entities.Blog;
import main.java.com.emine.core.entities.BlogEntry;
import main.java.com.emine.core.services.util.BlogEntryList;
import main.java.com.emine.core.services.util.BlogList;

public interface BlogService {
	/**
	 * @param blogId the id of the blog o add this BlogEntry to
	 * @param data the BlogEntry containing the data to be used fro
	 * @return the created BlogEntry with a generated ID
	 * @throws tutorial.core.services.exceptions.BlogNotFoundException
	 */
	public BlogEntry createBlogEntry(Long blogId, BlogEntry data);
	
	public BlogList findAllBlogs();
	
	public BlogEntryList findAllBlogEntries(Long blogId);
	
	public Blog findBlog(Long id);
	
	

}
