package entity;

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
    private String tontents;
    private int treplycount;
    private int tclickcount;
    private Date tpublishtime;
    private Date tmodifytime;

    @Override
    public String toString() {
        return "Topic{" +
                "tid=" + tid +
                ", tsid=" + tsid +
                ", tuid=" + tuid +
                ", ttopic='" + ttopic + '\'' +
                ", varchar='" + tontents + '\'' +
                ", treplycount=" + treplycount +
                ", tclickcount=" + tclickcount +
                ", tpublishtime=" + tpublishtime +
                ", tmodifytime=" + tmodifytime +
                '}';
    }

    public int getTid() {
        return tid;
    }

    public Topic(int tid, int tsid, int tuid, String ttopic, String tcontent, int treplycount, int tclickcount, Date tpublishtime, Date tmodifytime) {
        this.tid = tid;
        this.tsid = tsid;
        this.tuid = tuid;
        this.ttopic = ttopic;
        this.tontents = tcontent;
        this.treplycount = treplycount;
        this.tclickcount = tclickcount;
        this.tpublishtime = tpublishtime;
        this.tmodifytime = tmodifytime;
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

    public String getTcontents() {
        return tontents;
    }

    public void setTcontent(String tcontent) {
        this.tontents = tcontent;
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

    public Date getTpublishtime() {
        return tpublishtime;
    }

    public void setTpublishtime(Date tpublishtime) {
        this.tpublishtime = tpublishtime;
    }

    public Date getTmodifytime() {
        return tmodifytime;
    }

    public void setTmodifytime(Date tmodifytime) {
        this.tmodifytime = tmodifytime;
    }
}
