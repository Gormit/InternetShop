package by.gormit.shop.controller;

import by.gormit.shop.Goods;
import by.gormit.shop.Services;
import by.gormit.shop.Users;
import by.gormit.shop.constance.Constance;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Марина on 09.05.2015.
 */

@WebServlet("/account")
public class AccountController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            request.getRequestDispatcher(Constance.WEB_PATH_LOGIN_PAGE).forward(request, response);
        } else if (action.equalsIgnoreCase("logout")) {
            HttpSession session = request.getSession();
            session.removeAttribute("username");
            session.invalidate();
            request.getRequestDispatcher(Constance.WEB_PATH_INDEX_PAGE).forward(request, response);
        } else if (action.equalsIgnoreCase("login")) {
            request.getRequestDispatcher(Constance.WEB_PATH_LOGIN_PAGE).forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users user = new Services().getAuthentication(req.getParameter("mail"), req.getParameter("password"));
        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            ArrayList<Goods> goods = (ArrayList<Goods>) new Services().getGoods();
            req.setAttribute("goods", goods);
            req.getRequestDispatcher(Constance.WEB_PATH_HELLO_PAGE).forward(req, resp);
        } else {
            req.setAttribute("message", "Account's Invalid");
            req.getRequestDispatcher(Constance.WEB_PATH_LOGIN_PAGE).forward(req, resp);
        }
    }
}
