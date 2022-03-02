package net.sqlitetutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class table {


    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/db/movies.db";
        String url = "jdbc:sqlite:C://sqlite/db/movies.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS Movie (\n"
                + "	Movie_name text,\n"
                + "	actor text,\n"
                + "	actress text,\n"
		+ "	year int,\n"
		+ "	director text\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        createNewTable();
    }

}