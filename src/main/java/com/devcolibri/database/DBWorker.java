package com.devcolibri.database;

import com.mysql.fabric.ServerRole;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class DBWorker {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/wp_schema" +
            "?verifyServerCertificate=false&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public Connection connection;

    public DBWorker() {

//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            Statement statement = connection.createStatement();
//            statement.execute(" insert into users (name, age, email) values ('bora', 20 ,'heligi@rambler.ru');");
//            int res = statement.executeUpdate("update users set name='bora3' where idUsers=9;");
//            System.out.println(res);
//            ResultSet resultSet = statement.executeQuery("select * from users;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
