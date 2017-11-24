package test.com.bjsxt.service;

import com.bjsxt.model.User;
import com.bjsxt.service.UserService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®Ò»ÔÂ 18, 2017</pre>
 */
public class UserServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) applicationContext.getBean("userService");
        User u = new User();
        service.add(u);

    }



} 
