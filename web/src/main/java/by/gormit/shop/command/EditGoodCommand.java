package by.gormit.shop.command;

import by.gormit.shop.Goods;
import by.gormit.shop.Services;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Марина on 09.05.2015.
 */
public class EditGoodCommand extends Command {

    private static final Logger logger = Logger.getLogger(EditGoodCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        try {
            Goods good = new Services().getGood(Integer.parseInt(request.getAttribute("id").toString()));
            request.setAttribute("good", good);
            RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_TO_EDIT_GOOD_FORM);
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
    }
}
