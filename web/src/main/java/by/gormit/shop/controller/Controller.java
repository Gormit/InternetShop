package by.gormit.shop.controller;

import by.gormit.shop.command.Command;
import by.gormit.shop.command.HelloCommand;
import by.gormit.shop.command.LoginCommand;

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
        }

        command.execute(req, resp);
    }
}
