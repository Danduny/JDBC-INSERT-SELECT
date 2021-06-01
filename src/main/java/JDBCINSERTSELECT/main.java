package JDBCINSERTSELECT;

import java.sql.*;

public class main {
    public static void main(String args[]) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:5501/lamborghini", "root", "");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM auta");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("nazev"));
            System.out.println(resultSet.getString("obsah"));
            System.out.println("-----");
        }

        connection.close();
    }
}