package test.com.bjsxt.service;

import com.bjsxt.model.User;
import com.bjsxt.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * UserService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®Ò»ÔÂ 25, 2017</pre>
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

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        UserService service = (UserService) ctx.getBean("userService");
        System.out.println(service.getClass());
        service.add(new User());
        ctx.destroy();
    }

    /**
     * Method: getUserDAO()
     */
    @Test
    public void testGetUserDAO() throws Exception {
    }

    /**
     * Method: setUserDAO(UserDAO userDAO)
     */
    @Test
    public void testSetUserDAO() throws Exception {
    }

    /**
     * Method: destroy()
     */
    @Test
    public void testDestroy() throws Exception {
    }

}
