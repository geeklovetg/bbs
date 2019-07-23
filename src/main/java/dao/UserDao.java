package dao;

import entity.User;
import mvc.ContextConfigListener;
import utils.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 极客浅风
 * @create 2019/7/17 18:01
 */
public class UserDao {
    public List<User> findAll() {
        String sql = "select uid,username,nickname,password,email,phone_number from user";
        try(Connection conn= DBUtil.getConnection()) {
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            List<User> list=new ArrayList<>();
            while (rs.next()) {
                User user = row2user(rs);
                if (user!=null) {
                    list.add(user);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("用户获取失败");
        }


    }

    public int setUser(String username,String nickName,String password,String email,String phoneNumber){

        String sql="insert into user (uid,username,nickname,password,email,phone_number) values(null,?,?,?,?,?);";


        try (Connection conn=DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, nickName);
            ps.setString(3, password);
            ps.setString(4, email);
            ps.setString(5, phoneNumber);
            int n=ps.executeUpdate();
            return n;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public User row2user(ResultSet rs) {
        int uid = 0;
        String name = null;
        String password = null;
        String email = null;
        String phoneNumber=null;
        String nickname=null;
        try {
            uid = rs.getInt("uid");
            name = rs.getString("username");
            password = rs.getString("password");
            email = rs.getString("email");
            phoneNumber = rs.getString("phone_number");
            nickname=rs.getString("nickname");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        User user = new User(uid, name, password,email,nickname,phoneNumber);
        return user;
    }

    public User findByName(String username) {
        String sql = "select uid,username,password,email,phone_number,nickname from user where username=?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            User user =null;
            while (rs.next()) {
                user=row2user(rs);
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("查找用户失败");
        }
    }

}
