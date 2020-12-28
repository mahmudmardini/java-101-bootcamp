package com.spring.boot.dao.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books implements Serializable {

	private static final long serialVersionUID = -82439648328404424L;
	
	@Id
	@org.springframework.data.annotation.Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author_name")
	private String author_name;
	
	@Column(name = "publication_date")
	private String publication_date;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "note")
	private String note;
	
	@OneToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Authors> authors;

	public void setId(Long id) {
		this.id = id;
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

	public List<Authors> getAuthors() {
		return authors;
	}
	
	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}

	public Long getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((author_name == null) ? 0 : author_name.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((publication_date == null) ? 0 : publication_date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		
		if (id == null) {
			if (other.id != null)
				return false;
			
		} else if (!id.equals(other.id))
			return false;
		
		if (author_name == null) {
			if (other.author_name != null)
				return false;
		} else if (!author_name.equals(other.author_name))
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
			
		} else if (!title.equals(other.title))
			return false;
		if (publication_date == null) {
			if (other.publication_date != null)
				return false;
		} else if (!publication_date.equals(other.publication_date))
			return false;
	
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		
		return true;
	}
}


