
package lk.lms.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import lk.lms.db.DBConnection;
import lk.lms.model.ReturnRecord;


public class ReturnController {

    public static DefaultTableModel getBorrowedBooksByMember(int memberId) throws ClassNotFoundException, SQLException {
         Connection connection = DBConnection.getInstance().getConnection();

        String sql = "SELECT b.borrow_id, m.memberId, m.name, bk.bookId, bk.name AS bookName, " +
                     "b.date_borrowed, b.date_return, b.returned " +
                     "FROM borrow b " +
                     "JOIN member m ON b.member_id = m.memberId " +
                     "JOIN book bk ON b.book_id = bk.bookId " +
                     "WHERE m.memberId = ?";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, memberId);
        ResultSet rs = ps.executeQuery();

      
        DefaultTableModel model = new DefaultTableModel(
            new String[]{"Borrow ID", "Member ID", "Member Name", "Book ID", "Book Name", "Date Borrowed", "Date Return", "Returned"}, 0
        );

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("borrow_id"),
                rs.getInt("memberId"),
                rs.getString("name"),
                rs.getString("bookId"),
                rs.getString("bookName"),
                rs.getDate("date_borrowed"),
                rs.getDate("date_return"),
                rs.getBoolean("returned")
            });
        }

        return model;
    }

    public static boolean returnBook(int borrowId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "UPDATE borrow SET returned = TRUE, date_return = CURDATE() WHERE borrow_id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, borrowId);

        return ps.executeUpdate() > 0;
    }
    
    public static List<ReturnRecord> getAllBorrowedRecords() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT b.borrow_id, m.memberId, m.name AS memberName, "
                   + "bk.bookId, bk.name AS bookName, "
                   + "b.date_borrowed, b.date_return, b.returned "
                   + "FROM borrow b "
                   + "JOIN member m ON b.member_id = m.memberId "
                   + "JOIN book bk ON b.book_id = bk.bookId";
        
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        List<ReturnRecord> list = new ArrayList<>();
        while (rs.next()) {
            ReturnRecord record = new ReturnRecord(
                    rs.getInt("borrow_id"),
                    rs.getInt("memberId"),
                    rs.getString("memberName"),
                    rs.getString("bookId"),
                    rs.getString("bookName"),
                    rs.getDate("date_borrowed"),
                    rs.getDate("date_return"),
                    rs.getBoolean("returned")
            );
            list.add(record);
        }
        return list;
    }
    
    
}
