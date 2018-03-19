package DatabaseManipulation;

import java.sql.*;

public class DisplayAuthors {
    static final String Driver = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/codeup_test_db";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            Class.forName(Driver);
            connection = DriverManager.getConnection(DATABASE_URL,"codeup_db_user","admin123");

            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from albums");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            System.out.println("Albums DB: \n");

            for (int i = 1; i<= numberOfColumns;i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
                System.out.println();

            while(resultSet.next()){
                for(int i = 1; i<= numberOfColumns; i++)
                    System.out.printf("%-8s\t", resultSet.getObject(i));
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                resultSet.close();
                statement.close();
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}