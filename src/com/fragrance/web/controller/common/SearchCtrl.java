package com.fragrance.web.controller.common;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fragrance.web.commonservice.SearchServices;
import com.fragrance.web.entity.Celeb;
import com.fragrance.web.entity.Items;

@WebServlet("/HTML/rank/search")
//@WebServlet(urlPatterns= {"/HTML/*/search",
//						"/index/search"})
public class SearchCtrl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int index = 0;
		String query = request.getParameter("query");
		List<Items> itemlist = null;
		List<Celeb> celeblist = null;
		
		SearchServices service = new SearchServices();
		try {
			itemlist = service.getSearchItems(query);
			System.out.println("a");
			celeblist = service.getSearchCeleb(query);
			System.out.println("b");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("c");
		request.setAttribute("item", itemlist);
		request.setAttribute("celeb", celeblist);
		request.getRequestDispatcher("/HTML/search.jsp").forward(request, response);

	}

}
