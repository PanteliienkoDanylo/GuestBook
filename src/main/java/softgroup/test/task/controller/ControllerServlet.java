package softgroup.test.task.controller;


import softgroup.test.task.controller.command.Command;
import softgroup.test.task.controller.command.CommandFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerServlet extends HttpServlet{

    public static final String COMMAND = "command";

    private CommandFactory commandFactory;

    public ControllerServlet(){
        commandFactory = CommandFactory.getInstance();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String commandString = request.getParameter(COMMAND);
        Command command = commandFactory.getCommands(commandString);
        String path = command.execute(request, response);
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
    }
}
