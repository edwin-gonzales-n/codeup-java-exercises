package DatabaseManipulation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayAuthors {
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/codeup_test_db";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            Class.forName(Driver);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
