package by.it.patsko.project.java.controller.commands;

import by.it.patsko.project.java.controller.Actions;
import by.it.patsko.project.java.controller.Msg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandError extends ActionCommand {
    public static String errorMassage;
    public static String errorDetails;

    @Override
    public ActionCommand execute(HttpServletRequest req, HttpServletResponse resp) {
        req.setAttribute(Msg.ERROR, errorMassage);
        req.setAttribute(Msg.ERROR_DETAILS, errorDetails);
        return Actions.ERROR.command;
    }
}
