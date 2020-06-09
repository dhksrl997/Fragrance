package com.fragrance.web.controller.rank;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;

import com.fragrance.web.entity.Items;
import com.fragrance.web.service.RankServices;

@WebServlet("/HTML/rank/list")
//@WebServlet(urlPatterns = {
//		"/HTML/rank/mist",
//		"/HTML/rank/rist",
//		"/HTML/rank/sist",
//		"/HTML/rank/uist",
//		"/HTML/rank/wist"})
public class getList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RankServices service = new RankServices();
		List<Items> list = null;
		String get = request.getParameter("c");
		System.out.println(get);
		try {
			
			if (get.equals("m"))
				list = service.getManItems();

			if (get.equals("w"))
				list = service.getWomenItems();

			if (get.equals("u"))
				list = service.getUnisexItems();

			if (get.equals("s"))
				list = service.getSolidItems();

			if (get.equals("r"))
				list = service.getRollItems();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("list", list);
//		request.getRequestDispatcher("/HTML/rank/list.jsp").forward(request, response);
		TilesContainer container = TilesAccess.getContainer(
		        request.getSession().getServletContext());
		container.render("rank.list", request, response);
	}
}