package com.fragrance.web.serivces.rank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fragrance.web.entities.Items;


public class RankServices {
	public List<Items> getManLikeList() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		String sql = "Select * from Items order by maleLike desc LIMIT 3;";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getWomanLikeList() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items order by femaleLike desc LIMIT 3;";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getUnisexLikeList() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "SELECT *,maleLike+femaleLike as Likeresult FROM Items order by Likeresult DESC LIMIT 3";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}

	public int insertItems(Items items) throws ClassNotFoundException, SQLException {
		int result = 0; // 기본 반환값.

		String sql = "INSERT INTO Items(img,name,brand,size,price,scent,gender,maleLike,femaleLike,content) VALUES (?,?,?,?,?,?,?,?,?,?);";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
//		ResultSet rs = st.executeQuery();

		st.setString(1, items.getImg());
		st.setString(2, items.getName());
		st.setString(3, items.getBrand());
		st.setInt(4, items.getSize());
		st.setString(5, items.getPrice());
		st.setString(6, items.getScent());
		st.setString(7, items.getGender());
		st.setInt(8, items.getMaleLike());
		st.setInt(9, items.getFemaleLike());
		result = st.executeUpdate();
		st.close();
		con.close();

		return result;
	}

	
	public List<Items> getManItems() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items where gender = '남성'";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
//		st.setInt(1, (page-1)*5);
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getWomenItems() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items where gender = '여성'";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
//		st.setInt(1, (page-1)*5);
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getUnisexItems() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items where gender = '공용'";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
//		st.setInt(1, (page-1)*5);
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getSolidItems() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items where type = '고체'";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
//		st.setInt(1, (page-1)*5);
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	public List<Items> getRollItems() throws SQLException, ClassNotFoundException {
		List<Items> list = new ArrayList<>();
		int index = 0;
		
		String sql = "Select * from Items where type = '롤온'";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
//		st.setInt(1, (page-1)*5);
		while (rs.next()) {
			Items items =new Items(
					rs.getInt("itemnums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("gender"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}

}
