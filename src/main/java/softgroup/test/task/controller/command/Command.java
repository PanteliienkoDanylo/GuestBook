package softgroup.test.task.controller.command;


import softgroup.test.task.dao.DaoFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {

    public static final String PAGE_RECORDS_JSP = "records.jsp";
    public static final String PAGE_ADD_RECORDS_JSP = "add_records.jsp";

    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String BIRTHDAY = "birthday";
    public static final String PHONE_NUMBER = "phone_number";
    public static final String MAIL = "mail";
    public static final String COUNTRY = "country";
    public static final String CITY = "city";

    public static final String RECORDS = "records";

    public static final DaoFactory DAO_FACTORY;

    static {
        DAO_FACTORY = DaoFactory.getInstance();
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response);
}
