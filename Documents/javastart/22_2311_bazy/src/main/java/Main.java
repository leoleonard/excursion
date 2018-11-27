import java.sql.*;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/world?characterEncoding=utf8";
       String url = "jdbc:mysql://localhost:3306/world?useSSL=false";
       String username = "root";
       String password = "Damian789!";

       Connection connection = DriverManager.getConnection(url, username, password);
       // obiekt Statement - reprezentuje zapytanie do bazy danych

       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj kod kraju - POL, NLD");
       String userInput = scanner.next();
       System.out.println("Oto miasta wybranego kraju:");

       Statement statement = connection.createStatement();
       String query = "select * from city where countryCode =\"" + userInput + "\"";
       ResultSet resultSet = statement.executeQuery(query);

       while(resultSet.next()) {
           int id = resultSet.getInt(1); //id
           String name = resultSet.getString("Name");
           String countryCode = resultSet.getString(3);
           System.out.println(id + " " + name);
       }
       connection.close();
   }

}
