package main.java.com.emine.rest.controllers;

import main.java.com.emine.core.entities.BlogEntry;
import main.java.com.emine.core.services.BlogEntryService;
import main.java.com.emine.rest.resources.BlogEntryResource;
import main.java.com.emine.rest.resources.asm.BlogEntryResourceAsm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/rest/blog-entries")  //Class level request mapping 
public class BlogEntryController {

	BlogEntryService blogEntryService;

	public BlogEntryController(BlogEntryService service) {
		System.out.println("Diğer constructor içerisindeyim");
		this.blogEntryService = service;
	}
	
	public BlogEntryController() {
	}
	
	@RequestMapping(value="/{blogEntryId}", method=RequestMethod.GET) //Method level request mapping
	public ResponseEntity<BlogEntryResource> getBlogEntry( @PathVariable Long blogEntryId) {
		
		BlogEntry entry = blogEntryService.find(blogEntryId);
		if(entry !=null) {
			BlogEntryResource res = new BlogEntryResourceAsm().toResource(entry);
			return new ResponseEntity<BlogEntryResource>(res, HttpStatus.OK);
		} else {
			return new ResponseEntity<BlogEntryResource>(HttpStatus.NOT_FOUND);
		}
	}
}
