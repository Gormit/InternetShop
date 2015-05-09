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
public class DelGoodCommand extends Command {

    private static final Logger logger = Logger.getLogger(DelGoodCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        new Services().delGood(Integer.parseInt(request.getParameter("id")));
        ArrayList<Goods> goods = (ArrayList<Goods>) new Services().getGoods();
        request.setAttribute("goods", goods);
        RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_HELLO_PAGE);
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }

    }
}
