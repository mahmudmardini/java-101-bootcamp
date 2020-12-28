package com.spring.boot.dao.jpa.repository;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.spring.boot.dao.entity.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {

	@Query(value = "SELECT b FROM Books b WHERE b.id = :id")
	public Books findWithId(@Param("id") Long id);
	
	@Query(value = "SELECT * FROM books b WHERE b.title like %:title%", nativeQuery = true)
	public List<Books> searchBooksList(@Param("title") String keyword );
	
	@Query(value = "SELECT MAX(b.id) FROM Books b")
	public Long findMaxId();
	
	@Query(value = "SELECT b FROM Books b ")
	public List<Books> getAllBooksList();
		

}
