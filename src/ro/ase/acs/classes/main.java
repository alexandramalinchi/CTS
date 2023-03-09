package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws SQLException {
        Orchestrator orchestrator = new Orchestrator(new EmployeeTable());
        orchestrator.setTable(new EmployeeTable());
        orchestrator.runWorkFlow();
    }
}
