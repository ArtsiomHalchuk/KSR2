package by.epam.library.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.library.dao.DAOProvider;
import by.epam.library.dao.LibCreatorDAO;
import by.epam.library.entity.Book;
import by.epam.library.entity.Book.SortType;
import by.epam.library.entity.Library;
import by.epam.library.logic.comparator.BookByPagesCountComparator;
import by.epam.library.logic.comparator.BookByYearComparator;

public class LibLogicImpl implements LibLogic {

	@Override
	public void add(Book book) throws Exception {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();
		Library lib = libDAO.create();
		lib.add(book);
		libDAO.save(lib);
		

	}

	@Override
	public void delete(Book book) throws Exception {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();
		Library lib = libDAO.create();
		lib.remove(book);
		libDAO.save(lib);
		
	}

	@Override
	public List<Book> find(String author, SortType type) throws Exception {
		DAOProvider factory = DAOProvider.getInstance();
		LibCreatorDAO libDAO = factory.getLibCreatorDAO();
		
		Library lib = libDAO.create();
		List<Book> results = new ArrayList<Book>();
		for (Book book : lib.getBooks()) {
            if (book.getAuthor().equals(author)) {
                results.add(book);
            }
}
		
		if(type == Book.SortType.BY_PAGES_COUNT) {
			Collections.sort(results, new BookByPagesCountComparator());
		}else if(type == Book.SortType.BY_YEAR) {
			Collections.sort(results, new BookByYearComparator());
		}
		
		return results;
	}

}
