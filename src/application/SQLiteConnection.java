package application;

import java.sql.*;

/**
 * Creates a connection to the SQLite database.
 * @author Esther Leah Morrison
 *
 */
public class SQLiteConnection {

	private static final String QUERY_LATENCY_SEED = "NO_OP";
	
	/** 
	 * Creates a connection to the SQLite database.
	 */
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:RestaurantDatabase.sqlite");
			return connection;
		}
		catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
