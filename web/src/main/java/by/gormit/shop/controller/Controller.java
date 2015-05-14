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
        } else if (param.equalsIgnoreCase("login")) {
            command = new LoginCommand();
        } else if (param.equalsIgnoreCase("delGood")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new DelGoodCommand();
        } else if (param.equalsIgnoreCase("editGood")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new EditGoodCommand();
        } else if (param.equalsIgnoreCase("saveEditGood")) {
            command = new SaveEditGoodCommand();
        } else if (param.equalsIgnoreCase("addIntoOrder")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new AddIntoOrderCommand();
        } else if (param.equalsIgnoreCase("userList")) {
            command = new UserListCommand();
        } else if (param.equalsIgnoreCase("changeBunStatus")) {
            req.setAttribute("id", req.getParameter("id"));
            command = new ChangeBunStatus();
        }


        command.execute(req, resp);
    }
}
