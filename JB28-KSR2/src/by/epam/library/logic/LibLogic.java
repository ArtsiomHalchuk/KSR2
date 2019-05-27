package by.epam.library.logic;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.entity.Book.SortType;

public interface LibLogic {
	void add(Book book) throws Exception;
	void delete (Book book) throws Exception;
	List<Book> find (String author, SortType type) throws Exception;

}
