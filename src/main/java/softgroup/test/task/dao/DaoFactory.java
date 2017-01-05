package softgroup.test.task.dao;


public abstract class DaoFactory {

    public static final String JDBC_DRIVER_MYSQL = "softgroup.test.task.dao.mysql.MySqlDaoFactory";

    public abstract RecordDao createRecordDao();

    public static DaoFactory getInstance() {
        Class clazz;
        try {
            clazz = Class.forName(JDBC_DRIVER_MYSQL);
            return (DaoFactory) clazz.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}