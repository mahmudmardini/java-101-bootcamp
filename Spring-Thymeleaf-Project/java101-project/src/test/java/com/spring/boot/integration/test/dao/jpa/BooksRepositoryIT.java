package com.spring.boot.integration.test.dao.jpa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.dao.entity.Books;
import com.spring.boot.dao.jpa.repository.BooksRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource({ "classpath:application.properties" })
public class BooksRepositoryIT {
	
	@Autowired
	private BooksRepository boooksRepository;
	
	
	@Test
	@Order(1)
	public void selectBooksById() {
		
		Long maxId = boooksRepository.findMaxId();
		Books books = boooksRepository.findWithId(maxId);
		
		Assert.assertNotNull(books);
		Assert.assertTrue(books.getId() > 0);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	@Order(3)
	public void saveBooks() {
		
		Long maxId = boooksRepository.findMaxId();
		Long newBooksId = maxId + 1;
		
		Books books = new Books();
		books.setId(newBooksId );
		books.setTitle("testTitle");
		books.setAuthorName("testName");
		books.setDescription("testDesc");
		books.setPublicationDate("2015");
		books.setNote("just a test");
		boooksRepository.save(books);
		
		books = boooksRepository.findWithId(newBooksId);
		
		Assert.assertNotNull(books);
		Assert.assertTrue(books.getId() > 0);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	@Order(4)
	public void updateBooks() {
		
		Long maxId = boooksRepository.findMaxId();
		Books boooks = boooksRepository.findWithId(maxId);
		
		boooks.setAuthorName("Maro");
		boooks.setDescription("Hi :)");
		boooks.setNote("awesome!");
		
		boooksRepository.save(boooks);
		
		boooks = boooksRepository.findWithId(maxId);
		
		Assert.assertEquals("Maro", boooks.getAuthorName());
		Assert.assertEquals("Hi :)", boooks.getDescription());
		Assert.assertEquals("awesome!", boooks.getNote());
	}
	
	@Test
	@Transactional
	@Rollback(false)
	@Order(5)
	public void deleteBooks() {
		
		Long maxId = boooksRepository.findMaxId();
		Books boooks = boooksRepository.findWithId(maxId);
		
		boooksRepository.delete(boooks);
		
		boooks = boooksRepository.findWithId(maxId);
		
		Assert.assertNull(boooks);
	}
}
