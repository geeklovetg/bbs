package entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * 帖子实体
 * @Author 极客浅风
 * @create 2019/7/20 11:31
 */
public class Topic {
    private int tid;
    private int tsid;
    private int tuid;
    private String ttopic;
    private String tcontent;
    private int treplycount;
    private int tclickcount;
    private Timestamp tpublishtime;
    private Timestamp tmodifytime;
    private String tauthor;

    public Topic() {
    }

    public int getTid() {
        return tid;
    }

    public Topic(int tid, int tsid, int tuid, String ttopic, String tcontent, int treplycount, int tclickcount, Timestamp tpublishtime, Timestamp tmodifytime, String tauthor) {
        this.tid = tid;
        this.tsid = tsid;
        this.tuid = tuid;
        this.ttopic = ttopic;
        this.tcontent = tcontent;
        this.treplycount = treplycount;
        this.tclickcount = tclickcount;
        this.tpublishtime = tpublishtime;
        this.tmodifytime = tmodifytime;
        this.tauthor = tauthor;
    }

    public String getTauthor() {
        return tauthor;
    }

    public void setTauthor(String tauthor) {
        this.tauthor = tauthor;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "tid=" + tid +
                ", tsid=" + tsid +
                ", tuid=" + tuid +
                ", ttopic='" + ttopic + '\'' +
                ", tcontent='" + tcontent + '\'' +
                ", treplycount=" + treplycount +
                ", tclickcount=" + tclickcount +
                ", tpublishtime=" + tpublishtime +
                ", tmodifytime=" + tmodifytime +
                ", tauthor='" + tauthor + '\'' +
                '}';
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getTsid() {
        return tsid;
    }

    public void setTsid(int tsid) {
        this.tsid = tsid;
    }

    public int getTuid() {
        return tuid;
    }

    public void setTuid(int tuid) {
        this.tuid = tuid;
    }

    public String getTtopic() {
        return ttopic;
    }

    public void setTtopic(String ttopic) {
        this.ttopic = ttopic;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontents(String tcontent) {
        this.tcontent = tcontent;
    }

    public int getTreplycount() {
        return treplycount;
    }

    public void setTreplycount(int treplycount) {
        this.treplycount = treplycount;
    }

    public int getTclickcount() {
        return tclickcount;
    }

    public void setTclickcount(int tclickcount) {
        this.tclickcount = tclickcount;
    }

    public Timestamp getTpublishtime() {
        return tpublishtime;
    }

    public void setTpublishtime(Timestamp tpublishtime) {
        this.tpublishtime = tpublishtime;
    }

    public Timestamp getTmodifytime() {
        return tmodifytime;
    }

    public void setTmodifytime(Timestamp tmodifytime) {
        this.tmodifytime = tmodifytime;
    }
}
