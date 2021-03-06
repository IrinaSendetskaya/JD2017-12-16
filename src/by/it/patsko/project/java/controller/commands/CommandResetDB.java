package by.it.patsko.project.java.controller.commands;

import by.it.patsko.project.java.controller.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.ParseException;

public class CommandResetDB extends ActionCommand {
    @Override
    public ActionCommand execute(HttpServletRequest req, HttpServletResponse resp) throws ParseException, SQLException {
        if (!FormUtil.isPost(req)) {
            C_Reset.main(null);
            req.setAttribute(Msg.MESSAGE, "База данных удалена!!!");
        }
//        req.getSession().invalidate();
        return Actions.RESETDB.command;
    }
}
