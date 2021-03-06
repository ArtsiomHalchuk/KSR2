package by.epam.library.entity;

public class Book {
public String name;
public String author;
public int pagesCount;
public int year;


public Book(String name, String author, int pagesCount, int year) {
	super();
	this.name = name;
	this.author = author;
	this.pagesCount = pagesCount;
	this.year = year;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public int getPagesCount() {
	return pagesCount;
}


public void setPagesCount(int pagesCount) {
	this.pagesCount = pagesCount;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + pagesCount;
	result = prime * result + year;
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
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pagesCount != other.pagesCount)
		return false;
	if (year != other.year)
		return false;
	return true;
}


@Override
public String toString() {
	return "Book [name=" + name + ", author=" + author + ", pagesCount=" + pagesCount + ", year=" + year + "]";
}


public enum SortType{
	BY_PAGES_COUNT,
	BY_YEAR
}

}
