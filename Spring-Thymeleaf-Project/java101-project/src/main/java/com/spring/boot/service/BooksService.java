package com.spring.boot.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.boot.dao.entity.Books;
import com.spring.boot.dao.jpa.repository.BooksRepository;
import com.spring.boot.service.model.BooksContext;

@Service
public class BooksService implements IBooksService{
	
	@Autowired
	private BooksRepository booksRepository;
	
	public Books findWithId(Long id) {
		return booksRepository.findWithId(id);
	}
	
	
	public List<Books> getAllBooksList() {
		
		return booksRepository.getAllBooksList();
	}


	public List<Books> searchBooksList(BooksContext booksContext) {
		
		if(booksContext.getKeyword() != null) return booksRepository.searchBooksList(booksContext.getKeyword());	
		
		 return booksRepository.getAllBooksList(); 	
	}
	
	@Transactional
	public Long save(BooksContext booksContext) {
		
		Long maxId = booksRepository.findMaxId() + 1;
		
		Books books= new Books();
		books.setId(maxId);
		books.setTitle(booksContext.getTitle());
		books.setAuthorName(booksContext.getAuthorName());
		books.setPublicationDate(booksContext.getPublicationDate());
		books.setDescription(booksContext.getDescription());
		books.setNote(booksContext.getNote());
		books = booksRepository.save(books);
		
		return books.getId();
	}
	
	@Transactional
	public Long update(BooksContext booksContext) {
		
		Books books = booksRepository.findWithId(booksContext.getId());
		if(books == null)
		{
			throw new RuntimeException(booksContext.getId() + " ID not found in DB!");
		}
		
		books.setTitle(booksContext.getTitle());
		books.setPublicationDate(booksContext.getPublicationDate());
		books.setDescription(booksContext.getDescription());
		books.setNote(booksContext.getNote());
		
		booksRepository.save(books);
		return books.getId();
	}
	
	@Transactional
	public Long delete(Long id) {
		
		booksRepository.deleteAll();
		return id;
	}

}
