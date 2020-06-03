package Fragrance.web.Rank.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Fragrance.web.entity.Items;
import Fragrance.web.services.RankServices;

@WebServlet("/HTML/rank/list")
public class ListController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RankServices service = new RankServices();
		List<Items> manslist = null;
		List<Items> womanlist = null;
		List<Items> list = null;
		ArrayList<List<Items>> items = new ArrayList<List<Items>>();
		try {
			manslist = service.getMansItemList();
			womanlist = service.getWomanItemList();
			list = service.getItemList();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		items.add(manslist);
		items.add(womanlist);
		items.add(list);

		request.setAttribute("items", items);
		request.getRequestDispatcher("/WEB-INF/HTML/rank/list.jsp").forward(request, response);
	}
}
