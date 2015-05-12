package by.gormit.shop.controller;

import by.gormit.shop.Services;
import by.gormit.shop.Users;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Марина on 12.05.2015.
 */
@WebServlet("/registration")
public class RegistrationController extends HttpServlet {

    private static final Logger logger = Logger.getLogger(RegistrationController.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users user = new Users();
        user.setFirstname(request.getParameter("firstname"));
        user.setLastname(request.getParameter("lastname"));
        user.setMail(request.getParameter("mail"));
        user.setPassword(request.getParameter("password"));
        boolean allRight = new Services().addUser(user);
        RequestDispatcher dispatcher;
        if (allRight) {
            dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_THANKS_PAGE);
        } else {
            request.setAttribute("message", "Чувак, будь пооригенальнее )))");
            dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_REGISTRATION_PAGE);
        }

        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
