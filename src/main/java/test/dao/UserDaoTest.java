package test.dao; 

import dao.UserDao;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* UserDao Tester. 
* 
* @author <Authors name> 
* @since <pre>七月 18, 2019</pre> 
* @version 1.0 
*/ 
public class UserDaoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: findAll() 
* 
*/ 
@Test
public void testFindAll() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setUser(String username, String password, String email, String phoneNumber) 
* 
*/ 
@Test
public void testSetUser() throws Exception { 
//TODO: Test goes here...
    UserDao userDao=new UserDao();
    int n=userDao.setUser("test002","test0021","123","test002@gmail.com","18320459623");
    System.out.println(n);
}


/** 
* 
* Method: row2user(ResultSet rs) 
* 
*/ 
@Test
public void testRow2user() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findByName(String username) 
* 
*/ 
@Test
public void testFindByName() throws Exception { 
//TODO: Test goes here... 
} 


} 
