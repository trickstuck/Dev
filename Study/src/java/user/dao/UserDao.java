package javadao;

import java.sql.*;

public class UserDao {


	public User get(String id) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c = DriverManager.getConnection("jdbc:oracle:thin:@dalma.dongguk.ac.kr:1521:stud1", "trickstuck",
				"ms1123");

		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPw(rs.getString("pw"));

		rs.close();
		ps.close();
		c.close();

		return user;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao dao = new UserDao();

		User user = new User();
		user.setId("whiteship");
		user.setName("백기선");
		user.setPw("married");



		System.out.println(user.getId() + " 등록 성공");

		System.out.println(user.getName());
		System.out.println(user.getPw());

		System.out.println(user.getId() + " 조회 성공");
	}

}
