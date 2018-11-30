package library;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);




        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj autora");
        String author = scanner.nextLine();
        System.out.println("Podaj rok");
        int year = scanner.nextInt();
        System.out.println("Podaj isbn");
        int isbn = scanner.nextInt();

        Book book = new Book(title, author, year, isbn);

        try {
            BookDao bookDao = new BookDao();
            bookDao.save(book);
        } catch (SQLException e) {
            System.out.println("Nie udało się zapisać danych");
            e.printStackTrace();
        }


        scanner = new Scanner(System.in);
        System.out.println("Podaj id");
        int id = scanner.nextInt();
        try {
            BookDao dao = new BookDao();
            Book bookFromDB = dao.read(id);
            System.out.println(bookFromDB);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner = new Scanner(System.in);
        System.out.println("Podaj autora");
        String auth = scanner.nextLine();
        try {
            BookDao dao = new BookDao();
            List<Book> booksByAuthor = dao.allByAuthor(auth);
            System.out.println(booksByAuthor);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
