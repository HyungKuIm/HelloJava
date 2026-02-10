package test;

import java.sql.SQLException;

public class BoardInsert {

	public static void main(String[] args) {
		try (DatabaseConnection db = new DatabaseConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "appuser", "appuser123")) {
			String sql = "insert into board (name, description, created_date) values (?, ?, sysdate)";
			db.executeQuery(sql, "자바 제목과 내용2", "ㅋㅋㅋ2");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
