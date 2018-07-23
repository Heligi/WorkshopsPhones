package com.devcolibri.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static final String INSERT_NEW = "INSERT INTO users(name, age, email) VALUES(?,?,?)";
    public static final String GET_ALL = "SELECT * FROM users";
    public static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();
        preparedStatement = null;

//        try {
//            preparedStatement = dbWorker.getConnection().prepareStatement(INSERT_NEW);
//            preparedStatement.setString(1, "peta");
//            preparedStatement.setInt(2, 29);
//            preparedStatement.setString(3, "some@mail.ru");
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        try {
//            preparedStatement = dbWorker.getConnection().prepareStatement(GET_ALL);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                int age = resultSet.getInt("age");
//                String email = resultSet.getString("email");
//
//                System.out.println("name=" + name + " age=" + age + " email=" + email);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        String qwery = "select * from users;";

        try {
            Statement statement = dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(qwery);

            while (resultSet.next()) {
                User user = new User();
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
                user.setEmail(resultSet.getString("email"));

                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
