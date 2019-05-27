package by.epam.library.dao;

import by.epam.library.entity.Library;

public interface LibCreatorDAO {
	Library create() throws Exception;
	void save(Library lib) throws Exception;

}
