package test.com.bjsxt.registration.action;

import com.bjsxt.registration.action.UserAction;
import com.bjsxt.registration.vo.UserRegisterInfo;
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
public class UserActionTest {

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

    }

    /**
     * Method: execute()
     */
    @Test
    public void testExecute() throws Exception {
        UserAction action = new UserAction();
        UserRegisterInfo userInfo = new UserRegisterInfo();
        userInfo.setUsername("xx");
        userInfo.setPassword("oo");
        userInfo.setPassword2("oo");
        action.setUserInfo(userInfo);
        String ret = action.execute();
        Assert.assertEquals("success", ret);
    }


} 
