package test.com.bjsxt.service;

import com.bjsxt.aop.LogIntercept;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.dao.impl.UserDAOImpl;
import com.bjsxt.model.User;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.lang.reflect.Proxy;

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
//TODO: Test goes here... 
    }
    @Test
    public void testProxy() {
        UserDAO userDAO = new UserDAOImpl();
        LogIntercept logIntercept = new LogIntercept();
        logIntercept.setTarget(userDAO);
        UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), new Class[] {UserDAO.class}, logIntercept);
        System.out.println(userDAOProxy.getClass());
        userDAOProxy.delete();
        userDAOProxy.save(new User());
    }


} 
