package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Orchestrator {
    private Table table;
    public Orchestrator(Table table) {
        this.table=table;
    }
    public void setTable(Table table){
        this.table=table;
    }
    public void runWorkFlow(){
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            connection.setAutoCommit(false);

            EmployeeTable employeeTable = new EmployeeTable();
            employeeTable.createTable();
            employeeTable.insertData();
            employeeTable.readData();

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
