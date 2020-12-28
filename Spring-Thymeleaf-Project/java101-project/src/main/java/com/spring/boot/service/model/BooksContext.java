package com.spring.boot.service.model;

import java.io.Serializable;

public class BooksContext  implements Serializable {

	private static final long serialVersionUID = 3906169278470348749L;
	
	private Long id;
	private String title;
	private String author_name;
	private String publication_date;
	private String description;
	private String note;
	private String keyword;

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return author_name;
	}

	public void setAuthorName(String author_name) {
		this.author_name = author_name;
	}

	public String getPublicationDate() {
		return publication_date;
	}

	public void setPublicationDate(String publication_date) {
		this.publication_date = publication_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
