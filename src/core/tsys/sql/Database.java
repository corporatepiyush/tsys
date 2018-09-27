package core.tsys.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException {

		Class.forName("org.h2.Driver"); // dynamic import

		try(Connection connection = DriverManager.getConnection("jdbc:h2:mem:test")) {
			Statement statement = connection.createStatement();
			String SQL = " CREATE TABLE User (id INTEGER NOT NULL, firstName VARCHAR(50) )";
			boolean executeResult = statement.execute(SQL);
			System.out.println("Table created " + executeResult);
			statement.close();

			statement = connection.createStatement();
			SQL = "INSERT INTO User (id, firstName) VALUES (1, 'Leo Decaprio')";
			int executeUpdateResult = statement.executeUpdate(SQL);
			System.out.println("Rows Inserted " + executeUpdateResult);
			statement.close();

			selectRecords(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	private static void selectRecords(Connection connection) throws SQLException {
		Statement statement;
		String SQL;
		statement = connection.createStatement();
		SQL = "SELECT * FROM User";
		ResultSet rs = statement.executeQuery(SQL);
		while (rs.next()) {
			Integer id = rs.getInt(1);
			String firstName = rs.getString("firstName");
			System.out.println("id=" + id + ", firstName=" + firstName);
		}
		rs.close();
		statement.close();
	}

}
