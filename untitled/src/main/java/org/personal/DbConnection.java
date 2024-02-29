package org.personal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","0000");
        con.createStatement().execute("create table jaci(name varchar(30),id int);");
        con.close();

    }
}
