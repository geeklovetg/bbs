package utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author ASUS
 * @create 2019/7/3 9:28
 */
public class DBUtil {
    private static DataSource ds;
    static {
        InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties cfg=new Properties();
        try {
            cfg.load(in);
            ds=BasicDataSourceFactory.createDataSource(cfg);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("访问配置文件失败");
        }
    }

    public static Connection getConnection() {
        try {
            System.out.println("连接成功");
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败");
        }

    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
