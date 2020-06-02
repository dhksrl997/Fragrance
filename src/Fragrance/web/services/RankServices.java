package Fragrance.web.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Fragrance.web.entity.Items;




public class RankServices {
	public List<Items> getMansItemList() throws SQLException, ClassNotFoundException {
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
					rs.getInt("itemNums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("sort"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("sex"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike"),
					rs.getString("content")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getWomanItemList() throws SQLException, ClassNotFoundException {
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
					rs.getInt("itemNums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("sort"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("sex"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike"),
					rs.getString("content")
					);
			list.add(items);
		}
		rs.close();
		st.close();
		con.close();
		return list;
	}
	
	public List<Items> getItemList() throws SQLException, ClassNotFoundException {
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
					rs.getInt("itemNums"),
					rs.getString("img"),
					rs.getString("name"),
					rs.getString("brand"),
					rs.getInt("size"),
					rs.getString("sort"),
					rs.getString("price"),
					rs.getString("scent"),
					rs.getString("sex"),
					rs.getInt("maleLike"),
					rs.getInt("femaleLike"),
					rs.getString("content")
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

		String sql = "INSERT INTO Items(img,name,brand,size,sort,price,scent,sex,maleLike,femaleLike,content) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
		String url = "jdbc:mysql://dev.notepubs.com:9898/fragrance?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, "fragrance", "0505");
		PreparedStatement st = con.prepareStatement(sql);
//		ResultSet rs = st.executeQuery();

		st.setString(1, items.getImg());
		st.setString(2, items.getName());
		st.setString(3, items.getBrand());
		st.setInt(4, items.getSize());
		st.setString(5, items.getSort());
		st.setString(6, items.getPrice());
		st.setString(7, items.getScent());
		st.setString(8, items.getSex());
		st.setInt(9, items.getMaleLike());
		st.setInt(10, items.getFemaleLike());
		st.setString(11, items.getContent());
		result = st.executeUpdate();
		st.close();
		con.close();

		return result;
	}

}
