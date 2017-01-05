package softgroup.test.task.dao;


import softgroup.test.task.dao.entity.Record;

import java.util.List;

public interface RecordDao {

    void addRecord(Record record);
    List<Record> getAll();
}
