package test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelect {

	public static void main(String[] args) throws SQLException, Exception {

		try (DatabaseConnection db = new DatabaseConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "appuser", "appuser123")) {
				ResultSet rs = db.executeSelect("select id, name, description from board");

				while (rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String descripton = rs.getString("description");

					System.out.println(id + ", " + name + ", " + descripton);
				}
		}
	}

}
