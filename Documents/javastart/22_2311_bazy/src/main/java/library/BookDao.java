package library;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private final String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
    private final String username = "root";
    private final String password = "Damian789!";
    private Connection connection;

    public BookDao() throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void save(Book book) throws SQLException {
        final String insert = "insert into books (title, author, year, isbn) values(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(insert);
        statement.setString(1,  book.getTitle());
        statement.setString(2,  book.getAuthor());
        statement.setInt(3, book.getYear());
        statement.setInt(4, book.getIsbn());
        statement.executeUpdate();
    }

    public Book read(int id) throws SQLException {
        final String query = "select * from books where id=?";
        PreparedStatement select = connection.prepareStatement(query);
        select.setInt(1, id);
        ResultSet resultSet = select.executeQuery();
        Book result = null;
        if (resultSet.next()) {
            result = new Book();
            result.setId(resultSet.getInt("id"));
            result.setTitle(resultSet.getString("title"));
            result.setAuthor(resultSet.getString("author"));
            result.setYear(resultSet.getInt("year"));
            result.setIsbn(resultSet.getInt("isbn"));
        }
        return result;
    }

    public List<Book> allByAuthor(String author) throws SQLException {
        final String query = "select * from books where author=?";
        PreparedStatement select = connection.prepareStatement(query);
        select.setString(1, author);
        ResultSet resultSet = select.executeQuery();
        List<Book> result = new ArrayList<>();

        while(resultSet.next()) {
            Book bk = new Book();
            bk.setId(resultSet.getInt("id"));
            bk.setAuthor(resultSet.getString("author"));
            bk.setTitle(resultSet.getString("title"));
            bk.setYear(resultSet.getInt("year"));
            bk.setIsbn(resultSet.getInt("isbn"));
        }
        return result;
    }

}
