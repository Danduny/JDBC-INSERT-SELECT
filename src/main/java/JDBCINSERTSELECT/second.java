package JDBCINSERTSELECT;

import java.sql.*;

public class second {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/luxor", "root", "");

        String newnazev = "Squirelo";
        String newauto = "Lamborghini";
        String newobsah = "7.5L V16";
        int newcena = 999999;

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO knihy VALUES(NULL, ?, ?, ?, ?);");

        preparedStatement.setString(1, newnazev);
        preparedStatement.setString(2, newauto);
        preparedStatement.setString(3, newobsah);
        preparedStatement.setInt(4, newcena);

        preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();
    }

}