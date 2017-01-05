package softgroup.test.task.dao.mysql;


import softgroup.test.task.dao.RecordDao;
import softgroup.test.task.dao.entity.Record;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlRecordDao implements RecordDao{

    public static final String SQL_ADD_RECORD = "INSERT INTO record(name, surname, birthday, phone_number, mail, country, city) VALUES (?,?,?,?,?,?,?);";
    public static final String SQL_GET_ALL = "SELECT * FROM record";

    @Override
    public void addRecord(Record record) {
        MySqlConnection mySqlConnection = MySqlConnection.getInstance();
        Connection connection = mySqlConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(SQL_ADD_RECORD);
            ps.setString(1, record.getName());
            ps.setString(2, record.getSurname());
            ps.setDate(3, (Date) record.getBirthday());
            ps.setString(4, record.getPhoneNumber());
            ps.setString(5, record.getMail());
            ps.setString(6, record.getCountry());
            ps.setString(7, record.getCity());
            ps.executeUpdate();
        }catch (SQLException ex){
        }
    }

    @Override
    public List<Record> getAll() {
        List<Record> records = new ArrayList<Record>();
        MySqlConnection mySqlConnection = MySqlConnection.getInstance();
        Connection connection = mySqlConnection.getConnection();
        try{
            Statement query = connection.createStatement();
            ResultSet rs = query.executeQuery(SQL_GET_ALL);
            while(rs.next()){
                records.add(new Record(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
            }
        }catch(SQLException ex){
        }
        return records;
    }
}
