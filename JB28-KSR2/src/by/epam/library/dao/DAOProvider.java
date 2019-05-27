package by.epam.library.dao;

public class DAOProvider {
	private final static DAOProvider instance = new DAOProvider();
	
	private DAOProvider() {}
	
	private LibCreatorDAO creatorDAO = new LibCreatorDAOimpl();
	
	public static DAOProvider getInstance() {
		return instance;
	}
	
	public LibCreatorDAO getLibCreatorDAO() {
		return creatorDAO;
	}

}
