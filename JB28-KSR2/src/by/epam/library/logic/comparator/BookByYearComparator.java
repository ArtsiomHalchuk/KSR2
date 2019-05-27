package by.epam.library.logic.comparator;

import java.util.Comparator;

import by.epam.library.entity.Book;

public class BookByYearComparator implements Comparator<Book> {
	 
	
	public int compare(Book o1, Book o2) {
		if (o1.getYear() > o2.getYear()) {
            return 1;
        } else if (o1.getYear() == o2.getYear()) {
            return 0;
        } else {
            return -1;
}
	 }

}
