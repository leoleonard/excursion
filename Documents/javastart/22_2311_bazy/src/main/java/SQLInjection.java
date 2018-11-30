import java.sql.*;
import java.util.Scanner;

public class SQLInjection {



    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
        String username = "root";
        String password = "Damian789!";
        Connection connection = DriverManager.getConnection(url, username, password);

        String updateQuery = "update city set Population=? where Name=?";
        PreparedStatement statement = connection.prepareStatement(updateQuery);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miasta");
        String name = scanner.next();
        System.out.println("Oraz nową liczbę ludności");
        int updatedPopulation = scanner.nextInt();

        statement.setInt(1, updatedPopulation);
        statement.setString(2, name);

        int updatedRows = statement.executeUpdate();
        System.out.println("Zaktualizowane rekordy: " + updatedRows);

//        String selectQuery = "select * from city where Name=?";
//        PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
//        selectStatement.setString(1, city);
//        ResultSet resultSet = selectStatement.executeQuery();
//        while (ResultSet.next()) {
//            String name = resultSet.getString("Name");
//            int pop = resultSet.getInt("Population");
//            System.out.println(name + " " + pop);
//        }
        
        connection.close();
    }

}

