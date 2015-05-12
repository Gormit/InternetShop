package by.gormit.shop.command;

import by.gormit.shop.Services;
import by.gormit.shop.Users;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Марина on 10.05.2015.
 */
public class SaveNewUserCommand extends Command {

    private static final Logger logger = Logger.getLogger(SaveGoodCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        Users user = new Users();
        user.setFirstname(request.getParameter("firstname"));
        user.setLastname(request.getParameter("lastname"));
        user.setMail(request.getParameter("mail"));
        user.setPassword(request.getParameter("password"));
        boolean allRight = new Services().addUser(user);
        RequestDispatcher dispatcher = null;
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
