package test.dao; 

import dao.TopicDao;
import entity.Topic;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* TopicDao Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 22, 2019</pre> 
* @version 1.0 
*/ 
public class TopicDaoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: ShowAllTopic() 
* 
*/ 
@Test
public void testShowAllTopic() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: CreateTopic(int tid, int tsid, int tuid, String ttopic, String tcontents, int treplycount, int tclickcount, Timestamp tpublishtime, Timestamp tmodifytime) 
* 
*/ 
@Test
public void testCreateTopic() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findAllByUid(int Uid) 
* 
*/ 
@Test
public void testFindAllByUid() throws Exception { 
//TODO: Test goes here...
    TopicDao topicDao=new TopicDao();
    List<Topic> list=topicDao.findAllByUid(12);
    System.out.println(list);
} 


/** 
* 
* Method: row2topic(ResultSet rs) 
* 
*/ 
@Test
public void testRow2topic() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = TopicDao.getClass().getMethod("row2topic", ResultSet.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
