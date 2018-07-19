package dao;

import util.DBUtil;
import vo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private User user;
    private String sql;
    private DBUtil util = DBUtil.getInstance();
    private ResultSet rs;

    public User queryByAccount(String account){
        util.getConnection();
        sql = "select * from user where account = ?";
        User u = new User();
        List<Object> param = new ArrayList<Object>();
        param.add(account);
        try {
            rs = util.query(sql, param);
            if (rs.next()) {
                u.setPassword(rs.getString("password"));
            }else {
                u.setPassword(null);//没有此账号
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return u;
    }

    public User insertUser(User user){
        util.getConnection();
        sql = "select * from user where account = ?";
        User u = new User();
        List<Object> param = new ArrayList<Object>();
        param.add(user.getAccount());
        try {
            rs = util.query(sql, param);
            if (rs.next()) {
                u.setPassword("exsit");//账号已存在
            }else {
                sql = "insert into user (account, password) values (?, ?)";
                param.clear();
                param.add(user.getAccount());
                param.add(user.getPassword());
                util.update(sql,param);
                u.setPassword("succ");//注册成功
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            util.close();
        }
        return u;
    }


}
