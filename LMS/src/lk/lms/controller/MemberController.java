package lk.lms.controller;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.lms.db.DBConnection;
import lk.lms.model.Member;
import java.sql.*;

public class MemberController {

    public static boolean addMember(Member member) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO member VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, member.getMemberId());
        preparedStatement.setString(2, member.getName());
        preparedStatement.setString(3, member.getAddress());
        preparedStatement.setString(4, member.getEmail());
        int result = preparedStatement.executeUpdate();

        return result > 0;

    }

    public static boolean updateMember(Member updateMember) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE member SET name=?,address=?,email=? WHERE memberId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, updateMember.getName());
        preparedStatement.setString(2, updateMember.getAddress());
        preparedStatement.setString(3, updateMember.getEmail());
        preparedStatement.setInt(4, updateMember.getMemberId());
        int result = preparedStatement.executeUpdate();

        return result > 0;

    }

    public static Member searchMember(int memberId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM member WHERE memberId=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, memberId);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()) {
            return new Member(
                    rs.getInt("memberId"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("email")
            );
        }
        return null;

    }

    public static List<Member> getAllMembers() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM member";
        PreparedStatement pst = connection.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        List<Member> memberList = new ArrayList<>();
        while (rs.next()) {
            memberList.add(new Member(
                    rs.getInt("memberId"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("email")
            ));
        }
        return memberList;
    }

    public static boolean deleteMember(int memberId) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM member WHERE memberId=?";
        PreparedStatement pst = connection.prepareStatement(sql);
        pst.setInt(1, memberId);
        int result = pst.executeUpdate();
        return result > 0;
    }

}
