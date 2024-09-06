package kn;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO_web <T>{
	public ArrayList<T> getAll() throws SQLException;
	public void insert(T t) throws SQLException;
	public void update(T t) throws SQLException;
	public void delete( T t) throws SQLException;
	public ArrayList<T> getName(T t) throws SQLException;
	public ArrayList<T> getId(T t) throws SQLException;
	
	
	

}
