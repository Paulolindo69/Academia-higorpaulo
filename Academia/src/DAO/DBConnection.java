package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection instance;

    private static final String URL =
            "jdbc:postgresql://localhost:5432/teste2";

    private static final String USER = "postgres";

    private static final String PASSWORD = "1234";

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        System.out.println("Abrindo conexão...");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
