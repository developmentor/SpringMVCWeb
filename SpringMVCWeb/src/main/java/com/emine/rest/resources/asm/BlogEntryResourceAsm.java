package main.java.com.emine.rest.resources.asm;

import main.java.com.emine.core.entities.BlogEntry;
import main.java.com.emine.rest.controllers.BlogEntryController;
import main.java.com.emine.rest.resources.BlogEntryResource;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

//First parameter is what you converting from: BlogEntry nesnesini BlogEntryResource'a dönüştürüyor.
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource>{

	public BlogEntryResourceAsm() {
		super(BlogEntryController.class, BlogEntryResource.class);
	}

	@Override
	public BlogEntryResource toResource(BlogEntry blogEntry) {
		
		BlogEntryResource res = new BlogEntryResource();
		res.setTitle(blogEntry.getTitle());
		//Link link = linkTo(methodOn(BlogEntryController.class).getBlogEntry(blogEntry.getId())).withSelfRel();  // Method level RequestMapping kullanıyorsan sınıfa bu şekilde link verebilirsin. 
		//Hateoas sayesinde controller sınıfının metodunu çağıran bir lşnk oluşturuyoruz.
		Link link = linkTo(BlogEntryController.class).slash(blogEntry.getId()).withSelfRel();  // Class level RequestMapping kullanıyorsan sınıfa bu şekilde link verebilirsin. 
		System.out.println("Link: " + link); //<http://localhost/rest/blog-entries/1>;rel="self"
		res.add(link.withSelfRel());
		
		//Yukarıdaki resource için JSON nesne aşağıdaki gibi olur.
		/*
		 * {"title":"Test Title",
		 * "links":[{"rel":"self","href":"http://localhost/rest/blog-entries/1"}]}
		 * 
		 */
		
		return res;
	}
}
