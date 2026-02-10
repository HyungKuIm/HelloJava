package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection implements AutoCloseable{

	private Connection connection;

	public DatabaseConnection(String url, String id, String pwd) throws SQLException {
		this.connection = DriverManager.getConnection(url, id, pwd);
	}

	public void executeQuery(String sql, Object... params)
		throws SQLException {
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {

			for (int i = 0; i < params.length; i++) {
				stmt.setObject(i + 1, params[i]);
			}

			stmt.execute();
		}
	}

	public ResultSet executeSelect(String sql, Object... params)
		throws SQLException
	{
		PreparedStatement pstmt = connection.prepareStatement(sql);

		for (int i = 0; i < params.length; i++) {
			pstmt.setObject(i + 1, params[i]);
		}

		return pstmt.executeQuery();
	}



	@Override
	public void close() throws Exception {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Connection closed");
			}
		} catch (SQLException e) {
			System.err.println("Error closing connection:" + e);
		}

	}

}
