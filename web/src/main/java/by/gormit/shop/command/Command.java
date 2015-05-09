package by.gormit.shop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Марина on 09.05.2015.
 */
public abstract class Command
{
    public abstract void execute(HttpServletRequest request, HttpServletResponse response);
}
