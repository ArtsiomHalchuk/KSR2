package by.epam.library.main;

import java.util.List;

import by.epam.library.entity.Book;
import by.epam.library.logic.LibLogic;
import by.epam.library.logic.LibLogicImpl;

public class Main {

	public static void main(String[] args) throws Exception {
		LibLogic logic = new LibLogicImpl();
		
		Book test = new Book("book4","author1",10,2019);
		
		logic.add(test);
		logic.delete(test);
		print(logic.find("author1", Book.SortType.BY_YEAR));
		
		
	}
	
	
	public static void print(List<Book> books) {
		for (Book book : books) {
			System.out.printf("|%-10s|%-10s|%-5s|%-4d|\n", book.getName(), book.getAuthor(), book.getPagesCount(), book.getYear());
		}
	}

}
