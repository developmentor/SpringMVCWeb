package test.java.com.emine.test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.mockito.Mockito.*;
import main.java.com.emine.core.entities.BlogEntry;
import main.java.com.emine.core.services.BlogEntryService;
import main.java.com.emine.rest.controllers.BlogEntryController;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class BlogEntryControllerTest {

/*	@InjectMocks
	private BlogEntryController controller;
	
	@Mock
	private BlogEntryService service;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void getExistingBlogEntry() throws Exception {
		
		BlogEntry entry = new BlogEntry();
		entry.setId(1L);
		entry.setTitle("Test Title");
		
		//1L id li birentry bulduğunda entry i döndür.
		when(service.find(1L)).thenReturn(entry);
		
		//mockMvc nin bir get request yapmasını istiyoruz.
		mockMvc.perform(get("/rest/blog-entries/1"))
			.andDo(print())
			.andExpect(jsonPath("$.title", is(entry.getTitle())))
			.andExpect(jsonPath("$.links[*].href", hasItem(endsWith("/blog-entries/1"))))
			.andExpect(status().isOk());
			
			
	}
	
	@Test
	public void getNonExistingBlogEntry() throws Exception {
		
		//1L id li birentry bulduğunda entry i döndür.
		when(service.find(1L)).thenReturn(null);
		
		//mockMvc nin bir get request yapmasını istiyoruz.
		mockMvc.perform(get("/rest/blog-entries/1"))
			.andDo(print())
			.andExpect(status().isNotFound());
			
			
	}*/
}
