package by.it.akhmelev.project8.java.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("FrontController: "+req.getMethod()+" "+req.getRequestURI()+"?"+req.getQueryString());
        Command command = Actions.defineCommand(req);
        Command nextStep = null;
        ServletContext servletContext = getServletContext();
        try {
            nextStep = command.execute(req);
        } catch (Exception e) {
            req.setAttribute(Msg.ERROR, e.getMessage());
        }

        if (nextStep == null || nextStep==command) //конец, показать jsp
        {
            String viewJsp = command.getJsp();
            RequestDispatcher dispatcher = servletContext.getRequestDispatcher(viewJsp);
            dispatcher.forward(req, resp);
        }
        else //еще есть операция, которую нужно выполнить. redirect на get
        {
            resp.sendRedirect("do?command="+nextStep);
        }
    }
}
