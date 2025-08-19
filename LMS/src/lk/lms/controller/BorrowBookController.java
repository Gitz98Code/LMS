
package lk.lms.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.lms.db.DBConnection;

public class BorrowBookController {

    public static int getBorrowedCount(int memberId) throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT COUNT(*) FROM borrow WHERE member_id = ? AND returned = false";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, memberId);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return 0;
    }

    public static boolean issueBook(int memberId, String bookId, Date dateBorrowed, Date dateReturn) throws ClassNotFoundException, SQLException {
        int count = getBorrowedCount(memberId);
        if (count >= 4) {
            return false; 
        }

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO borrow (member_id, book_id, date_borrowed, date_return, returned) VALUES (?,?,?,?,false)";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, memberId);
        pst.setString(2, bookId);
        pst.setDate(3, dateBorrowed);
        pst.setDate(4, dateReturn);

        return pst.executeUpdate() > 0;
    }
    
    
}
