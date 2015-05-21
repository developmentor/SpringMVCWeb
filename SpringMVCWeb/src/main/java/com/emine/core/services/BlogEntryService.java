package main.java.com.emine.core.services;

import main.java.com.emine.core.entities.BlogEntry;

public interface BlogEntryService {
	
	public BlogEntry findBlogEntry(Long id); 
	public BlogEntry deleteBlogEntry(Long id);
	
	/**
	 * @param id the id of the BlogEntry to updateBlogEntry
	 * @param data the BlogEntry containing the data to be used for to update
	 * @return the updated BlogEntry or null if the BlogEntry with the 
	 */
	public BlogEntry updateBlogEntry(Long id, BlogEntry data);

}
