import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) throws SQLException {

        //wczytanie danych od uzytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko");
        String lastName = scanner.nextLine();
        System.out.println("Podaj wypłatę");
        double salary = scanner.nextDouble();

        //utworzenie obiektu
        Employee employee = new Employee(firstName, lastName, salary);

        try {
            EmployeDao employeDao = new EmployeDao();
            //tutaj zapisanie obiektu
            employeDao.save(employee);
        } catch (SQLException e) {
            System.out.println("Nie udało się zapisać w bazie");
            e.printStackTrace();
        }
    }

}
