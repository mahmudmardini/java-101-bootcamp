package com.spring.boot.integration.test.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import com.spring.boot.dao.entity.Books;
import com.spring.boot.service.model.BooksContext;

@RunWith(SpringRunner.class)
//Web service integration test usage with random port! You have to set this setting!
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource({ "classpath:application.properties" })
public class BooksControllerIT {
	@Autowired
    private TestRestTemplate restTemplate;

	@LocalServerPort
	private int tomcatPortNo;
	
	@Test
	@Order(1)
	public void testRestTemplate() {
		
		ResponseEntity<String> response = restTemplate.getForEntity("https://www.google.com", String.class);
		
		System.out.println(tomcatPortNo);
		
		Assert.assertTrue(HttpStatus.OK.equals(response.getStatusCode()));
		Assert.assertTrue(response.getBody().length() > 0);
	}
	
	@Test
	@Order(2)
	public void findBooksById() {
		
		String url = prepareBooksRestServiceRootUrl() + "books/10003";
		
		ResponseEntity<Books> response = restTemplate.getForEntity(url, Books.class);
		
		Books emp = response.getBody();
		
		Assert.assertTrue(HttpStatus.OK.equals(response.getStatusCode()));
		Assert.assertTrue(10003 == emp.getId());
	}
	
	@Test
	@Order(3)
	public void saveBooks() {
		
		String url = prepareBooksRestServiceRootUrl() + "books";
		
		BooksContext booksContext = new BooksContext();
		booksContext.setTitle("Hello java!");
		booksContext.setAuthorName("Maroo");
		booksContext.setPublicationDate("2015");
		booksContext.setDescription("Hello world!");
		booksContext.setNote("non imoprtant");

		ResponseEntity<Long> response = restTemplate.postForEntity(url, booksContext, Long.class);
		
		Long id = response.getBody();
		
		Assert.assertTrue(HttpStatus.OK.equals(response.getStatusCode()));
		Assert.assertNotNull(id);
	}
	
	
	private String prepareBooksRestServiceRootUrl() {
		
		return "http://localhost:" + tomcatPortNo + "/company/";
	}
}
