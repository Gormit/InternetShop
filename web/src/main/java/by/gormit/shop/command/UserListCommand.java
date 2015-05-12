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
import java.util.ArrayList;

/**
 * Created by Марина on 12.05.2015.
 */
public class UserListCommand extends Command {

    private static final Logger logger = Logger.getLogger(UserListCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        ArrayList<Users> users = (ArrayList<Users>) new Services().getUsers();
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_USERS_LIST_PAGE);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
