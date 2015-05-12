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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Марина on 09.05.2015.
 */
public class SaveEditGoodCommand extends Command {

    private static final Logger logger = Logger.getLogger(SaveEditGoodCommand.class);

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        Pattern pattern = Pattern.compile("^[0-9]+");
        Matcher matcher = pattern.matcher(request.getParameter("count"));
        if (!matcher.matches()) {
            request.setAttribute("invalidCount", "Только цифровые значения");
            RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_TO_EDIT_GOOD_FORM);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                logger.error(e);
            } catch (IOException e) {
                logger.error(e);
            }
        } else {
            Goods good = new Goods();
            good.setName(request.getParameter("name"));
            good.setCategory(Integer.parseInt(request.getParameter("category")));
            good.setManufacturer(Integer.parseInt(request.getParameter("manufacturer")));
            good.setCount(Integer.parseInt(request.getParameter("count")));
            good.setPrice(Integer.parseInt(request.getParameter("price")));
            good.setDescription(request.getParameter("description"));
            new Services().updateGood(Integer.parseInt(request.getParameter("id")), good);
            ArrayList<Goods> goods = (ArrayList<Goods>) new Services().getGoods();
            request.setAttribute("goods", goods);
            RequestDispatcher dispatcher = request.getRequestDispatcher(Constance.WEB_PATH_HELLO_PAGE);
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                logger.error(e);
            } catch (IOException e) {
                logger.error(e);
            }
        }

    }
}
