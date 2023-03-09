package ro.ase.acs.interfaces;

import java.sql.SQLException;

public interface Table {
    void createTable() throws SQLException;
    void insertData() throws SQLException;
    void readData() throws SQLException;
}
