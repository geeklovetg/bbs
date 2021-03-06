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
        String sql="select tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime,tauthor from topic order by tpublishtime desc";
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

    public Topic showTopic(int tid) {
        String sql="select tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime,tauthor from topic where tid=?";
        try (Connection conn= DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,tid);
            ResultSet rs=ps.executeQuery();
            Topic topic=new Topic();
            while(rs.next()){
                topic=row2topic(rs);
            }
            return topic;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public int delete(int tid) {
        String sql = "delete from topic where tid=?";
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,tid);
            int n=ps.executeUpdate();
            return n;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("删除失败");
        }
    }

    /**
     * 新增主题
     * @return
     */
    public int CreateTopic(int tid, int tsid, int tuid, String ttopic, String tcontents, int treplycount, int tclickcount, Timestamp tpublishtime, Timestamp tmodifytime,String tauthor) {
        String sql="insert into topic (tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime,tauthor) values(null,?,?,?,?,?,?,?,?,?)";
        try (Connection conn=DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1, tsid);
            ps.setInt(2, tuid);
            ps.setString(3, ttopic);
            ps.setString(4, tcontents);
            ps.setInt(5, treplycount);
            ps.setInt(6, tclickcount);
            ps.setTimestamp(7, tpublishtime);
            ps.setTimestamp(8, tmodifytime);
            ps.setString(9, tauthor);
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
        Timestamp tpublishtime=rs.getTimestamp("tpublishtime");
        Timestamp tmodifytime=rs.getTimestamp("tmodifytime");
        String tauthor = rs.getString("tauthor");
        return new Topic(tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime,tauthor);
    }

    /**
     * 根据用户id搜索帖子
     * @return 返回帖子对象集合
     */
    public List<Topic> findAllByUid(int Uid) {
        String sql="select tid,tsid,tuid,ttopic,tcontents,treplycount,tclickcount,tpublishtime,tmodifytime,tauthor from topic where tuid=? order by tpublishtime desc";
        System.out.println(Uid+"uid");
        try (Connection conn= DBUtil.getConnection()){
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,Uid);
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
}
