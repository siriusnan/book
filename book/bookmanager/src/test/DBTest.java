package test;

import util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest {
    public static void main(String[] args) {
        DBUtil util = DBUtil.getInstance();
        Connection conn = util.getConnection();
        //查询学生全表
        String sql = "select * from user";
        ResultSet rs = util.query(  sql ,null ) ;
        try {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "    " + rs.getString("account") + "    " + rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
