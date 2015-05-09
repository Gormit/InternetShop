package by.gormit.shop.controller;

import by.gormit.shop.Categories;
import by.gormit.shop.Goods;
import by.gormit.shop.Manufacturers;
import by.gormit.shop.Services;
import by.gormit.shop.constance.Constance;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Марина on 09.05.2015.
 */
@WebServlet("/view")
public class ViewController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Goods good = new Services().getGood(Integer.parseInt(req.getParameter("id")));
        Categories category = new Services().getCategory(good.getCategory());
        Manufacturers manufacturer = new Services().getManufacturer(good.getManufacturer());
        req.setAttribute("good", good);
        req.setAttribute("category", category);
        req.setAttribute("manufacturer", manufacturer);
        req.getRequestDispatcher(Constance.WEB_PATH_VIEW_PAGE).forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
