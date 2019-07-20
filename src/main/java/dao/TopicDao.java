package dao;

import entity.Topic;
import utils.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 从获取帖子信息
 * @Author 极客浅风
 * @create 2019/7/20 11:38
 */
public class TopicDao {
    /**
     * 显示所有帖子主题
     * @return 返回topic对象集合
     */
    public List<Topic> ShowAllTopic() {
        String sql="select * from topic";
        try (Connection conn= DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            List<Topic> list=new ArrayList<Topic>();
            while(rs.next()){
                list.add(row2topic(rs));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    /**
     * 新增主题
     * @return
     */
    public int CreateTopic(int tid, int tsid, int tuid, String ttopic, String tcontents, int treplycount, int tclickcount, Date tpublishtime, Date tmodifytime) {
        String sql="insert into topic (tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime) values(null,?,?,?,?,?,?,?,?)";
        try (Connection conn=DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, tsid);
            ps.setInt(2, tuid);
            ps.setString(3, ttopic);
            ps.setString(4, tcontents);
            ps.setInt(5, treplycount);
            ps.setInt(6, tclickcount);
            ps.setDate(7, tpublishtime);
            ps.setDate(8, tmodifytime);
            int n=ps.executeUpdate();
            return n;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private Topic row2topic(ResultSet rs) throws SQLException {
        int tid = rs.getInt("tid");
        int tsid=rs.getInt("tsid");
        int tuid=rs.getInt("tuid");
        String ttopic=rs.getString("ttopic");
        String tcontents=rs.getString("tcontents");
        int treplycount=rs.getInt("treplycount");
        int tclickcount=rs.getInt("tclickcount");
        Date tpublishtime=rs.getDate("tpublishtime");
        Date tmodifytime=rs.getDate("tmodifytime");
        return new Topic(tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime);
    }
}