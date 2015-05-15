package by.gormit.shop.filter;

import by.gormit.shop.constance.Constance;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Марина on 09.05.2015.
 */
public class SessionFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpSession session = req.getSession();
        if (session.getAttribute("user") == null && !req.getRequestURI().endsWith("account")) {
            req.getRequestDispatcher(Constance.WEB_PATH_LOGIN_PAGE).forward(servletRequest, servletResponse);
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }

    }

    public void destroy() {

    }
}
