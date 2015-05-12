package by.gormit.shop.command;

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
public class RegistrationCommand extends Command {

    private static final Logger logger = Logger.getLogger(RegistrationCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_REGISTRATION_PAGE);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
    }

}
