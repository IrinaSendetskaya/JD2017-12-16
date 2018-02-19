package by.it.krasutski.jd03_01;

import java.sql.*;

public class C_Reset {
    public static void main(String[] args) {
        resetDB();
    }

    public static void resetDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = (Connection) DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/krasutski" +
                        "?useUnicode=true&characterEncoding=UTF-8",
                "root",
                "")) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE `ads`");
            statement.executeUpdate("DROP TABLE `users`");
            statement.executeUpdate("DROP TABLE `category`");
            statement.executeUpdate("DROP TABLE `roles`");

            System.out.println("Database reset");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
