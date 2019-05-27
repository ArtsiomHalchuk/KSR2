package by.epam.library.logic.comparator;

import java.util.Comparator;

import by.epam.library.entity.Book;

public class BookByPagesCountComparator implements Comparator<Book> {
	
	@Override
	public int compare (Book object1, Book object2) {
		return object1.getPagesCount() - object2.getPagesCount();
	}

}
