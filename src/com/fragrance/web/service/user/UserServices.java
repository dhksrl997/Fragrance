package com.fragrance.web.service.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fragrance.web.entity.User;


public class UserServices {

	public int regUser(User user) throws SQLException, ClassNotFoundException {
		int result = 0;
		List<User> list = new ArrayList<>();
		String sql = "INSERT INTO User(mail,pw,nickName,name,age,gender) VALUES(?,?,?,?,?,?);";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, user.getMail());
		st.setString(2, user.getPw());
		st.setString(3, user.getNickName());
		st.setString(4, user.getName());
		st.setInt(5, user.getAge());
		st.setString(6, user.getGender());
		result = st.executeUpdate();

		st.close();
		con.close();
		return result;
	}

	public int doLogin(String mail,String pw) throws SQLException, ClassNotFoundException {
		String sql = "SELECT pw FROM User WHERE mail=?";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, mail);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			if(rs.getString("pw").equals(pw))
				return 1;//성공
			else 
				return -2;
		}
		st.close();
		con.close();
		return 0;
	}

}
