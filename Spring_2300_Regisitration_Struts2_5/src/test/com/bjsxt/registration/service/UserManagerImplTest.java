package test.com.bjsxt.registration.service;

import com.bjsxt.registration.model.User;
import com.bjsxt.registration.service.UserManager;
import com.bjsxt.registration.service.impl.UserManagerImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * UserManager Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮһ�� 28, 2017</pre>
 */
public class UserManagerImplTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: exists(User user)
     */
    @Test
    public void testExists() throws Exception {
        UserManager userManager = new UserManagerImpl();
        User u = new User();
        u.setUsername("a@163.com");
        boolean exists = userManager.exists(u);
        Assert.assertTrue(exists);
    }

    /**
     * Method: add(User user)
     */
    @Test
    public void testAdd() throws Exception {
        UserManager userManager = new UserManagerImpl();
        User u = new User();
        u.setUsername("b");
        u.setPassword("b");
        boolean exists = userManager.exists(u);
        if (!exists) {
            userManager.add(u);
            exists = userManager.exists(u);
            Assert.assertTrue(exists);
            //此处会在数据库中添加数据，添加完毕后应该回滚
            //后续需要实现rollback
        } else  {
            Assert.fail("not added!");
        }
    }


} 
