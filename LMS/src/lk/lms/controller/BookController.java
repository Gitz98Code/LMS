package lk.lms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.lms.db.DBConnection;
import lk.lms.model.Book;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class BookController {

    public static boolean addBook(Book book) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO book VALUES(?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, book.getBookId());
        preparedStatement.setString(2, book.getName());
        preparedStatement.setString(3, book.getAuthor());
        preparedStatement.setString(4, book.getPublisher());
        int result = preparedStatement.executeUpdate();

        return result > 0;

    }

    public static boolean updateBook(Book updateBook) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE book SET name=?,author=?,publisher=? WHERE bookId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, updateBook.getName());
        preparedStatement.setString(2, updateBook.getAuthor());
        preparedStatement.setString(3, updateBook.getPublisher());
        preparedStatement.setString(4, updateBook.getBookId());
        int result = preparedStatement.executeUpdate();
        return result > 0;
    }

    public static Book searchBook(String bookId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM book WHERE bookId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, bookId);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return new Book(
                    rs.getString("bookId"),
                    rs.getString("name"),
                    rs.getString("author"),
                    rs.getString("publisher")
            );
        }
        return null;
    }

    public static boolean deleteBook(String bookId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM book WHERE bookId=?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setString(1, bookId);
        int result = pst.executeUpdate();
        return result > 0;

    }

    public static List<Book> getAllBooks() throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM book";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<Book> bookList = new ArrayList<>();
        while (rs.next()) {
            bookList.add(new Book(
                    rs.getString("bookId"),
                    rs.getString("name"),
                    rs.getString("author"),
                    rs.getString("publisher")
            ));
        }
        return bookList;
    }
}
