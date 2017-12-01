package test.com.bjsxt.registration.action;

import com.bjsxt.registration.action.UserAction;
import com.bjsxt.registration.vo.UserRegisterInfo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
     * Method: getUsers()
     */
    @Test
    public void testList() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserAction action = (UserAction) context.getBean("user");
        action.list();
        Assert.assertTrue(action.getUsers().size() == 7);
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
    @Test
    public void testLoad() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserAction action = (UserAction) context.getBean("userAction");
        UserRegisterInfo info = new UserRegisterInfo();
        info.setId(1);
        action.load();
        System.out.println(action.getUser().getClass());
        Assert.assertTrue(action.getUser() != null);
        /*
        本地可以运行，但是web上不能加载
         */
    }


} 
