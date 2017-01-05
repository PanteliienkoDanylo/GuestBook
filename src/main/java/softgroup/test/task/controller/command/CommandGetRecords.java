package softgroup.test.task.controller.command;


import softgroup.test.task.dao.entity.Record;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class CommandGetRecords extends Command{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        List<Record> records = DAO_FACTORY.createRecordDao().getAll();
        request.setAttribute(RECORDS, records);
        return PAGE_RECORDS_JSP;
    }
}
