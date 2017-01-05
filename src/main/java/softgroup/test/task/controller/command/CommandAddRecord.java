package softgroup.test.task.controller.command;


import softgroup.test.task.dao.entity.Record;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CommandAddRecord extends Command {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        List<Record> records = DAO_FACTORY.createRecordDao().getAll();

        String name = request.getParameter(NAME);
        String surname = request.getParameter(SURNAME);
        String birthday = request.getParameter(BIRTHDAY);

        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        Date startDate = new Date();
        try {
            startDate = df.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String phoneNumber = request.getParameter(PHONE_NUMBER);
        String mail = request.getParameter(MAIL);
        String country = request.getParameter(COUNTRY);
        String city = request.getParameter(CITY);

        Record record = new Record(name, surname, new java.sql.Date(startDate.getTime()), phoneNumber, mail, country, city);

        if(!records.contains(record)) {
            DAO_FACTORY.createRecordDao().addRecord(record);
            return CommandFactory.getInstance().getCommands(RECORDS).execute(request, response);
        }else{
            return PAGE_ADD_RECORDS_JSP;
        }


    }
}
