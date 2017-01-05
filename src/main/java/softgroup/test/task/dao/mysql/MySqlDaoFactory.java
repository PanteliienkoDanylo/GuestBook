package softgroup.test.task.dao.mysql;


import softgroup.test.task.dao.DaoFactory;
import softgroup.test.task.dao.RecordDao;

public class MySqlDaoFactory extends DaoFactory{

    @Override
    public RecordDao createRecordDao() {
        return new MySqlRecordDao();
    }
}
