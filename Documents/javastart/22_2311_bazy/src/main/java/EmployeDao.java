import java.net.URL;
import java.sql.*;

public class EmployeDao {
    private final String url = "jdbc:mysql://localhost:3306/pracownicy?useSSL=false";
    private final String username = "root";
    private final String password = "Damian789!";
    private Connection connection;

    public EmployeDao() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        //polaczenie z baza danych
    }

    //2.zapis

    public void save(Employee employee) throws SQLException {
        final String insert = "insert into pracownik(firstName, lastName, salary) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insert);
        // przekazanie obiektu reprezentujacego pracownika
        // wstawienie obiektu do bazy danych
        statement.setString(1, employee.getFirstName());
        statement.setString(2, employee.getLastName());
        statement.setDouble(3, employee.getSalary());
        // a nastepnie zaktualizowanie bazy danych nowym obiektem
        statement.executeUpdate();

    }

    // 3. odczyt
    public Employee read(int id) throws SQLException {
        final String query = "select * from pracownik where id=?";
        PreparedStatement select = connection.prepareStatement(query);
        select.setInt(1, id);
        ResultSet resultSet = select.executeQuery();
        Employee result = null;
        if(resultSet.next()) {
            result = new Employee();
            result.setId(resultSet.getInt("id"));
            result.setFirstName(resultSet.getString("firstName"));
            result.setLastName(resultSet.getString("lastName"));
            result.setSalary(resultSet.getDouble("salary"));
        }
        return result;

    }

    //4. usuwanie



}
