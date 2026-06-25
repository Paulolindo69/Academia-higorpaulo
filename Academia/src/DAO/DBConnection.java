package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static DBConnection instance = null;
	private static Connection connection;
	
	
	private DBConnection() {
		
		try {
			if (connection == null || connection.isClosed()) {
				connection = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/teste2",
						"postgres",
						"1234"
						);
				System.out.print("Conectado ao banco!");
				}	
		}catch (SQLException e) {
			System.out.print("Erro ao conectar ao banco!");
			e.printStackTrace();
				
			}
		
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public static DBConnection getInstance() {
		
		if (instance == null) {
			instance = new DBConnection();
		}
		
		return instance;
	}
	
}





