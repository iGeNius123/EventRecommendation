package db;

import db.mysql.MySQLConnection;

public class DBConnectionFactory {
	
	//this should be changed based on popeline
	private static final String DEFAULT_DB="mysql";
	
	public static DBConnection getConnection(String db) {
		switch(db) {
		
		case "mysql":
			return new MySQLConnection();
			//return null;
			
		case "mongodb":
			//return new MongoDBConnection();
			return null;
			
		default:
			throw new IllegalArgumentException("Invalid db: "+db);
				
		}
	}
	
	public static DBConnection getConnection() {
		return getConnection(DEFAULT_DB);
	}
	

}
