package test.com.bjsxt.service;

import com.bjsxt.model.User;
import com.bjsxt.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮһ�� 21, 2017</pre>
 */
public class UserServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: init()
     */
    @Test
    public void testInit() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: add(User user)
     */
    @Test
    public void testAdd() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getUserDAO()
     */
    @Test
    public void testGetUserDAO() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setUserDAO(UserDAO userDAO)
     */
    @Test
    public void testSetUserDAO() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) context.getBean("userService");
        service.add(new User());
    }

    /**
     * Method: destory()
     */
    @Test
    public void testDestory() throws Exception {
//TODO: Test goes here... 
    }


} 
