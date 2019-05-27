package by.epam.library.dao;

import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;

import by.epam.library.entity.Book;
import by.epam.library.entity.Library;

public class LibCreatorDAOimpl implements LibCreatorDAO {
	
	@Override
	public Library create() throws Exception {
		Library lib = new Library();
		FileReader fr = new FileReader("resources/library.txt");
		Scanner scan = new Scanner(fr);
		
		String row;
		while (scan.hasNextLine()) {
			row=scan.nextLine();
			
			Scanner rowScanner = new Scanner(row);
            rowScanner.useDelimiter(",");
            if (rowScanner.hasNext()) {
            	String name = rowScanner.next();
            	String author = rowScanner.next();
            	int pagesCount = rowScanner.nextInt();
            	int year = rowScanner.nextInt();
            	
            	Book book = new Book (name, author, pagesCount, year);
            	lib.add(book);
            }
            rowScanner.close();
		}
		scan.close();
		fr.close();
		return lib;
	}

	@Override
	public void save(Library lib) throws Exception {
		FileWriter fw = new FileWriter ("resources/library.txt", false);
		String row = null;
		String library = "";
		
		for (Book book : lib.getBooks()) {
			row = book.getName() + "," + book.getAuthor() + "," + book.getPagesCount()  + "," + book.getYear() + "\n";
			library +=row;
		}
		fw.write(library);
		fw.close();
	}

}
