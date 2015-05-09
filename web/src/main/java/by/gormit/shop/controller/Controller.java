package by.gormit.shop.controller;

import by.gormit.shop.command.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Марина on 09.05.2015.
 */
public class Controller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String param = req.getParameter("param");
        Command command = null;
        if (param == null) {
            command = new HelloCommand();
        } else if (param.equals("login")) {
            command = new LoginCommand();
        } else if (param.equals("addGood")) {
            command = new AddGoodCommand();
        } else if (param.equals("saveGood")) {
            command = new SaveGoodCommand();
        } else if (param.equals("delGood")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new DelGoodCommand();
        } else if (param.equals("editGood")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new EditGoodCommand();
        } else if (param.equals("saveEditGood")) {
            command = new SaveEditGoodCommand();
        }


        command.execute(req, resp);
    }
}
