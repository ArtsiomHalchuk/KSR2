package by.epam.library.entity;

import java.util.List;
import java.util.ArrayList;

public class Library {
	private List<Book> books;

	public Library() {
		super();
		this.books = new ArrayList<Book>() ;
	}
	

	public void add(Book book) {
		books.add(book);
	}
	
	public void remove(Book book) {
		books.remove(book);
	}

	
	
	
	public List<Book> getBooks() {
		return books;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
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
		Library other = (Library) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Library [books=" + books + "]";
	}
	
	
}
